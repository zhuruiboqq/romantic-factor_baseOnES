package com.sishuok.es.common.repository.Specification;

import java.util.Collection;

import org.hibernate.criterion.MatchMode;
import org.springframework.util.StringUtils;

import com.sishuok.es.common.entity.search.ConnectOperator;
import com.sishuok.es.common.entity.search.SearchOperator;

/**
 * 条件构造器 用于创建条件表达式
 * @Class Name Restrictions
 * @Author lee
 */
public class RestrictionUtil {

	/**
	 * 等于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression eq(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.eq);
	}

	/**
	 * 不等于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression ne(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.ne);
	}

	/**
	 * 模糊匹配
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression like(String fieldName, String value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.like);
	}

	/**
	 * 
	 * @param fieldName
	 * @param value
	 * @param matchMode
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression like(String fieldName, String value, MatchMode matchMode, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return null;
	}

	/**
	 * 大于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression gt(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.gt);
	}

	/**
	 * 小于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression lt(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.lt);
	}

	/**
	 * 大于等于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression lte(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.gte);
	}

	/**
	 * 小于等于
	 * @param fieldName
	 * @param value
	 * @param ignoreNull
	 * @return
	 */
	public static SimpleExpression gte(String fieldName, Object value, boolean ignoreNull) {
		if (StringUtils.isEmpty(value))
			return null;
		return new SimpleExpression(fieldName, value, SearchOperator.lte);
	}

	/**
	 * 并且
	 * @param criterions
	 * @return
	 */
	public static LogicalExpression and(CriterionCustom... criterions) {
		return new LogicalExpression(criterions, ConnectOperator.and);
	}

	/**
	 * 或者
	 * @param criterions
	 * @return
	 */
	public static LogicalExpression or(CriterionCustom... criterions) {
		return new LogicalExpression(criterions, ConnectOperator.or);
	}

	/**
	 * 包含于
	 * @param fieldName
	 * @param value
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static LogicalExpression in(String fieldName, Collection value, boolean ignoreNull) {
		if (ignoreNull && (value == null || value.isEmpty())) {
			return null;
		}
		SimpleExpression[] ses = new SimpleExpression[value.size()];
		int i = 0;
		for (Object obj : value) {
			ses[i] = new SimpleExpression(fieldName, obj, SearchOperator.eq);
			i++;
		}
		return new LogicalExpression(ses, ConnectOperator.or);
	}

	/**
	 * 应用例子
	 */
	public static void example() {
		/*
		CriteriaCustom<Event> c = new CriteriaCustom<Event>();
		c.add(RestrictionUtil.like("code", searchParam.getCode(), true));
		c.add(RestrictionUtil.eq("level", searchParam.getLevel(), false));
		c.add(RestrictionUtil.eq("mainStatus", searchParam.getMainStatus(), true));
		c.add(RestrictionUtil.eq("flowStatus", searchParam.getFlowStatus(), true));
		c.add(RestrictionUtil.eq("createUser.userName", searchParam.getCreateUser(), true));
		c.add(RestrictionUtil.lte("submitTime", searchParam.getStartSubmitTime(), true));
		c.add(RestrictionUtil.gte("submitTime", searchParam.getEndSubmitTime(), true));
		c.add(RestrictionUtil.eq("needFollow", searchParam.getIsfollow(), true));
		c.add(RestrictionUtil.ne("flowStatus", CaseConstants.CASE_STATUS_DRAFT, true));
		c.add(RestrictionUtil.in("solveTeam.code", teamCodes, true));
		eventDao.findAll(c);
		*/
	}
}