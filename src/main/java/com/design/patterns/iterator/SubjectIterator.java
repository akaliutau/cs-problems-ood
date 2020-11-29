package com.design.patterns.iterator;

public class SubjectIterator extends Collector<String> implements Iterator<String> {

	public SubjectIterator(String[] collection) {
		this.collection = collection;
	}

	@Override
	public String next() {
		return collection[index++];
	}

	@Override
	public boolean hasNext() {
		return index < collection.length;
	}

	@Override
	Iterator<String> getIterator() {
		reset();
		return this;
	}

}
