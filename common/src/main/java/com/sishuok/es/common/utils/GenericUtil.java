package com.sishuok.es.common.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class GenericUtil {

	public static Class<?> getGenericType(Class<?> cls) {
		// java泛型编译后被擦除了，只记录了类的泛化类型，不能反射出运行时申明的类型。
		// 因此，此方法只能返回在类中明确申明了的泛型类型。
		TypeVariable[] tvs = cls.getTypeParameters();
		Class<?> ret = null;
		if (tvs != null && tvs.length > 0) {
			Type[] tps = tvs[0].getBounds();
			if (tps != null && tps.length > 0) {
				Object tp = tps[0];
				if (tp instanceof Class) {
					return (Class) tp;
				}
				if (tp instanceof TypeVariable) {
					ret = getGenericType((TypeVariable) tp);
				} else if (tp instanceof ParameterizedType) {
					ret = getGenericType((ParameterizedType) tp);
				}
				if (ret != null) {
					return ret;
				}
			}
		}
		// 若子类未定义，则用超类的。
		if (cls.getSuperclass() == Object.class) {
			return null;
		}
		ret = ReflectUtils.findParameterizedType(cls, 0);
		if (ret != null) {
			return ret;
		}
		return getGenericType(cls.getSuperclass());
	}

	private static Class getGenericType(TypeVariable t) {
		Type[] tps = t.getBounds();
		if (tps != null && tps.length > 0) {
			Object tp = tps[0];
			if (tp instanceof Class) {
				return (Class<?>) tp;
			} else if (tp instanceof TypeVariable) {
				return getGenericType((TypeVariable) tp);
			} else if (tp instanceof ParameterizedType) {
				return getGenericType((ParameterizedType) tp);
			}
		}
		return null;
	}

	private static Class getGenericType(ParameterizedType t) {
		return (Class) t.getRawType();
		//		Type[] tps = ((ParameterizedType) t).getActualTypeArguments();
		//		if (tps != null && tps.length > 0) {
		//			Object tp = tps[0];
		//			if (tp instanceof Class) {
		//				return (Class<?>) tp;
		//			} else if (tp instanceof TypeVariable) {
		//				return getGenericType((TypeVariable) tp);
		//			} else if (tp instanceof ParameterizedType) {
		//				return getGenericType((ParameterizedType) tp);
		//			}
		//		}
		//		return null;
	}

}
