package com.design.patterns.nullobject;

public class NullObject<T> {
	final private T val;

	public NullObject(T val) {
		this.val = val;
	}

	public T get() {
		return val;
	}

	boolean exists() {
		return val == null;
	}
}
