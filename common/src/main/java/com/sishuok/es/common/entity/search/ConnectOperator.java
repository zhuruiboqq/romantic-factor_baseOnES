package com.sishuok.es.common.entity.search;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import com.sishuok.es.common.entity.search.exception.SearchException;

public enum ConnectOperator {
	or("或者", "or"), and("并且", "and");
	private final String info;
	private final String symbol;

	ConnectOperator(final String info, String symbol) {
		this.info = info;
		this.symbol = symbol;
	}

	public String getInfo() {
		return info;
	}

	public String getSymbol() {
		return symbol;
	}

	public static String toStringAllOperator() {
		return Arrays.toString(SearchOperator.values());
	}

	/**
	 * 操作符是否允许为空
	 *
	 * @param operator
	 * @return
	 */
	public static boolean isAllowBlankValue(final SearchOperator operator) {
		return operator == SearchOperator.isNotNull || operator == SearchOperator.isNull;
	}

	public static ConnectOperator valueBySymbol(String symbol) throws SearchException {
		symbol = formatSymbol(symbol);
		for (ConnectOperator operator : values()) {
			if (operator.getSymbol().equals(symbol)) {
				return operator;
			}
		}

		throw new SearchException("ConnectOperator not method search operator symbol : " + symbol);
	}

	private static String formatSymbol(String symbol) {
		if (StringUtils.isBlank(symbol)) {
			return symbol;
		}
		return symbol.trim().toLowerCase().replace("  ", " ");
	}
}