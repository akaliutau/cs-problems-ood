package com.design.patterns.objectpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ObjectPool<T> {
	private Queue<T> pool = new LinkedList<>();
	private int size;

	public void init(List<T> lst) {
		this.size = lst.size();
		pool.addAll(lst);
	}

	public T borrow() throws Exception {
		if (pool.isEmpty()) {
			throw new Exception("Max borrow limit reached");
		}
		return pool.poll();
	}

	public void add(T t) {
		pool.add(t);
	}

	public int getLimit() {
		return size;
	}
}
