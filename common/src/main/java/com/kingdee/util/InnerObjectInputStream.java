package com.kingdee.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class InnerObjectInputStream extends ObjectInputStream{
	public InnerObjectInputStream(InputStream in) throws IOException {
		super(in);
		innerLoader = null;
	}

	public InnerObjectInputStream() throws IOException, SecurityException {
		innerLoader = null;
	}

	public InnerObjectInputStream(InputStream in, ClassLoader loader) throws IOException {
		this(in);
		innerLoader = loader;
	}

	protected Class resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
		try {
			return super.resolveClass(desc);
		} catch (Exception e) {
			if (innerLoader != null)
				return innerLoader.loadClass(desc.getName());
			if (e instanceof IOException)
				throw (IOException) e;
			if (e instanceof ClassNotFoundException)
				throw (ClassNotFoundException) e;
			else
				throw new ClassNotFoundException("Can not found class " + desc.getName());
		}
	}

	private ClassLoader innerLoader;
}
