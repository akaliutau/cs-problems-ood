package com.design.patterns.iterator;

public interface Iterator<T> {
	T next();

	boolean hasNext();
}
