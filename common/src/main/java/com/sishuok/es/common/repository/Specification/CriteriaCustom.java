package com.sishuok.es.common.repository.Specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

/**
 * 定义一个查询条件容器
 * @author lee
 * 
 * @param <T>
 */
public class CriteriaCustom<T> implements Specification<T> {
	private List<CriterionCustom> criterions = new ArrayList<CriterionCustom>();

	public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		if (!criterions.isEmpty()) {
			List<Predicate> predicates = new ArrayList<Predicate>();
			for (CriterionCustom c : criterions) {
				predicates.add(c.toPredicate(root, query, builder));
			}
			// 将所有条件用 and 联合起来  
			if (predicates.size() > 0) {
				return builder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		}
		return builder.conjunction();
	}

	/**
	 * 增加简单条件表达式
	 * @Methods Name add
	 * @Create In 2012-2-8 By lee
	 * @param expression0 void
	 */
	public void add(CriterionCustom criterion) {
		if (criterion != null) {
			criterions.add(criterion);
		}
	}
}