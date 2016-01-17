package com.kingdee.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class StringUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyMMdd");
	private static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");

	/**
	 * yyMMdd
	 * 
	 * @return
	 */
	public static String nowDate() {
		return sdf2.format(new Date());
	}

	/**
	 * yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String now() {
		return sdf.format(new Date());
	}

	public static String getDateStr(Date date, String format) {
		if (format.equals("yyyy-MM-dd HH:mm:ss"))
			return sdf.format(date);
		if (format.equals("yyMMdd"))
			return sdf2.format(date);
		if (format.equals("yyyyMMdd"))
			return sdf3.format(date);

		SimpleDateFormat temp = new SimpleDateFormat(format);
		return temp.format(date);
	}

	public static boolean isEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}

	public static String lowerFirstChar(String name) {
		return Character.toLowerCase(name.charAt(0)) + name.substring(1);
	}

	public static String encodeId(String longId) {
		return longId.replace('0', 'A').replace('1', 'B').replace('2', 'C').replace('3', 'D').replace('4', 'E').replace('5', 'F').replace('6', 'G')
				.replace('7', 'H').replace('8', 'I').replace('9', 'J');
	}

	public static String decodeId(String id) {
		return id.replace('A', '0').replace('B', '1').replace('C', '2').replace('D', '3').replace('E', '4').replace('F', '5').replace('G', '6')
				.replace('H', '7').replace('I', '8').replace('J', '9');
	}

	/**
	 * 转换成sql的in语句参数，类似：'id1','id2','id3'
	 * 
	 * @param ids
	 * @return
	 */
	public static String toSQLString(Long[] ids) {
		StringBuffer str = new StringBuffer();
		for (Long id : ids)
			str.append("'").append(id).append("',");
		str.setLength(str.length() - 1);
		return str.toString();
	}

	/**
	 * 转换成sql的in语句参数，类似：'id1','id2','id3'
	 * 
	 * @param ids
	 * @return
	 */
	public static String toSQLString(Iterator ids) {
		StringBuffer str = new StringBuffer();

		while (ids.hasNext())
			str.append("'").append(ids.next().toString()).append("',");

		str.setLength(str.length() - 1);
		return str.toString();
	}

	/**
	 * 返回在整数前面补0的字符串，如果整数的长度大于参数length，返回参数整数
	 * 
	 * @param num
	 *            整数
	 * @param length
	 *            长度，整个字符串的长度(包含整数部分)
	 * @return 补0的字段串
	 */
	public static String getFormatInt(int num, int length) {
		if (length < 1 || length > 10)
			throw new IllegalArgumentException("长度不符合要求，在1到10内");
		String numStr = String.valueOf(num);
		if (numStr.length() >= length)
			return numStr;

		while (numStr.length() < length)
			numStr = "0" + numStr;
		return numStr;
	}

	/**主要处理空值返回空字符串
	 * @param value
	 * @return
	 */
	public static String valueOf(Object value) {
		if (value == null)
			return "";
		return value.toString();
	}

	public static boolean equals(String s1, String s2) {
		if (isEmpty(s1))
			return isEmpty(s2);
		else
			return s1.equals(s2);
	}

	public static boolean equalsIgnoreCase(String s1, String s2) {
		if (isEmpty(s1))
			return isEmpty(s2);
		else
			return s1.equalsIgnoreCase(s2);
	}
	
	/**
	 * 数字、符号个数
	 * 
	 * @param value
	 * @return
	 */
	public static int numberCount(String value) {
		if (value == null)
			return 0;
		int sum = 0;
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if ((c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
				sum += 1;
			}
		}
		return sum;
	}
}
