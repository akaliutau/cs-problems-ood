package com.design.patterns.iterator;

public abstract class Collector<T> {
	protected T[] collection;
	protected int index = 0;

	protected void reset() {
		index = 0;
	};

	abstract Iterator<T> getIterator();
}
