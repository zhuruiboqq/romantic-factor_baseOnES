package com.kingdee.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectUtils {
	public ObjectUtils() {
	}

	public static Object[] toObjectArray(Object obj) {
		Object arr[] = new Object[1];
		arr[0] = obj;
		return arr;
	}

	public static Object[] toObjectArray(Object obj1, Object obj2) {
		Object arr[] = new Object[2];
		arr[0] = obj1;
		arr[1] = obj2;
		return arr;
	}

	public static Object[] toObjectArray(Object obj1, Object obj2, Object obj3) {
		Object arr[] = new Object[3];
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;
		return arr;
	}

	public static Object createCopy(Object o) throws CloneNotSupportedException {
		if (!(java.io.Serializable.class).isAssignableFrom(o.getClass()))
			throw new CloneNotSupportedException();
		ByteArrayOutputStream baOut = new ByteArrayOutputStream();
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(baOut);
			objOut.writeObject(o);
			ByteArrayInputStream baIn = new ByteArrayInputStream(baOut.toByteArray());
			ObjectInputStream objIn = new InnerObjectInputStream(baIn, o.getClass().getClassLoader());
			return objIn.readObject();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		}
	}

	public static Class getArgumentTypeClass(String argumentType) {
		boolean isArray = false;
		if (argumentType.indexOf("[") > 0 && argumentType.indexOf("]") > 0) {
			isArray = true;
			argumentType = argumentType.replace('[', ' ');
			argumentType = argumentType.replace(']', ' ');
		}
		argumentType = argumentType.trim();
		Class returnClass = null;
		try {
			if (!isArray) {
				if (StringUtil.equalsIgnoreCase(argumentType, "integer"))
					returnClass = Integer.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "short"))
					returnClass = Short.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "int"))
					returnClass = Integer.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "long"))
					returnClass = Long.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "float"))
					returnClass = Float.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "double"))
					returnClass = Double.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "char"))
					returnClass = Character.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "boolean"))
					returnClass = Boolean.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "byte"))
					returnClass = Byte.TYPE;
				else if (StringUtil.equalsIgnoreCase(argumentType, "bigdecimal"))
					returnClass = Class.forName("java.math.BigDecimal");
				else if (StringUtil.equalsIgnoreCase(argumentType, "date"))
					returnClass = Class.forName("java.sql.Date");
				else if (StringUtil.equalsIgnoreCase(argumentType, "time"))
					returnClass = Class.forName("java.sql.Time");
				else if (StringUtil.equalsIgnoreCase(argumentType, "timestamp"))
					returnClass = Class.forName("java.sql.Timestamp");
				else if (StringUtil.equalsIgnoreCase(argumentType, "string"))
					returnClass = Class.forName("java.lang.String");
				else if (StringUtil.equalsIgnoreCase(argumentType, "bosuuid"))
					returnClass = Class.forName("com.kingdee.bos.util.BOSUuid");
				else if (StringUtil.equalsIgnoreCase(argumentType, "uuid"))
					returnClass = Class.forName("com.kingdee.util.Uuid");
				else if (StringUtil.equalsIgnoreCase(argumentType, "enum"))
					returnClass = Class.forName("com.kingdee.util.enums.Enum");
				else if (StringUtil.equalsIgnoreCase(argumentType, "ObjectPK") || StringUtil.equalsIgnoreCase(argumentType, "IObjectPK"))
					returnClass = Class.forName("com.kingdee.bos.dao.IObjectPK");
				else
					returnClass = Class.forName(argumentType);
			} else {
				if (StringUtil.equalsIgnoreCase(argumentType, "integer"))
					returnClass = int[].class;
				if (StringUtil.equalsIgnoreCase(argumentType, "short"))
					returnClass = short[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "int"))
					returnClass = int[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "long"))
					returnClass = long[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "float"))
					returnClass = float[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "double"))
					returnClass = double[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "char"))
					returnClass = char[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "boolean"))
					returnClass = boolean[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "byte"))
					returnClass = byte[].class;
				else if (StringUtil.equalsIgnoreCase(argumentType, "bigdecimal"))
					returnClass = Class.forName("[Ljava.math.BigDecimal;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "date"))
					returnClass = Class.forName("[Ljava.sql.Date;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "time"))
					returnClass = Class.forName("[Ljava.sql.Time;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "timestamp"))
					returnClass = Class.forName("[Ljava.sql.Timestamp;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "string"))
					returnClass = Class.forName("[Ljava.lang.String;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "bosuuid"))
					returnClass = Class.forName("[Lcom.kingdee.bos.util.BOSUuid;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "uuid"))
					returnClass = Class.forName("[Lcom.kingdee.util.Uuid;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "enum"))
					returnClass = Class.forName("[Lcom.kingdee.util.enum.Enum;");
				else if (StringUtil.equalsIgnoreCase(argumentType, "ObjectPK") || StringUtil.equalsIgnoreCase(argumentType, "IObjectPK"))
					returnClass = Class.forName("[Lcom.kingdee.bos.dao.IObjectPK;");
				else
					returnClass = Class.forName("[L" + argumentType + ";");
			}
			return returnClass;
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
