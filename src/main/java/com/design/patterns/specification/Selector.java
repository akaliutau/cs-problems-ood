package com.design.patterns.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class Selector<T> implements Predicate<T> {
	private List<Selector<T>> selectors = new ArrayList<>();

	@Override
	public boolean test(T t) {
		for (Selector<T> select : selectors) {
			if (!select.test(t)) {
				return false;
			}
		}
		return true;
	}
	
	public Selector<T> and(Selector<T> other) {
		selectors.add(other);
		return this;
	}
}
