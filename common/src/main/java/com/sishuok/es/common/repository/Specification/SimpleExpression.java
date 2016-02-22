package com.sishuok.es.common.repository.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.expression.spel.ast.Operator;
import org.springframework.util.StringUtils;

import com.sishuok.es.common.entity.search.SearchOperator;

/**
 * 简单条件表达式
 * @author lee
 * 
 */
public class SimpleExpression implements CriterionCustom {

	private String fieldName; //属性名  
	private Object value; //对应值  
	private SearchOperator operator; //计算符  

	protected SimpleExpression(String fieldName, Object value, SearchOperator operator) {
		this.fieldName = fieldName;
		this.value = value;
		this.operator = operator;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getValue() {
		return value;
	}

	public SearchOperator getOperator() {
		return operator;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Predicate toPredicate(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		Path expression = null;
		if (fieldName.contains(".")) {
			String[] names = StringUtils.split(fieldName, ".");
			expression = root.get(names[0]);
			for (int i = 1; i < names.length; i++) {
				expression = expression.get(names[i]);
			}
		} else {
			expression = root.get(fieldName);
		}

		switch (operator) {
		case eq:
			return builder.equal(expression, value);
		case ne:
			return builder.notEqual(expression, value);
		case like:
			return builder.like((Expression<String>) expression, "%" + value + "%");
		case lt:
			return builder.lessThan(expression, (Comparable) value);
		case gt:
			return builder.greaterThan(expression, (Comparable) value);
		case lte:
			return builder.lessThanOrEqualTo(expression, (Comparable) value);
		case gte:
			return builder.greaterThanOrEqualTo(expression, (Comparable) value);
		default:
			return null;
		}
	}

}