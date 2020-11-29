package com.design.usecases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K, V> {

	class Pair {
		K key;
		V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	class Bucket {
		private List<Pair> bucket = new LinkedList<>();
		
		private Pair find(K key) {
			for (Pair pair : bucket) {
				if (pair.key.equals(key))
					return pair;
			}
			return null;
		}

		public V get(K key) {
			Pair pair = find(key);
			return pair == null ? null : pair.value;
		}

		public void update(K key, V value) {
			Pair pair = find(key);
			if (pair == null) {
				bucket.add(new Pair(key, value));
			}else {
				pair.value = value;
			}
		}

		public void remove(K key) {
			for (Pair pair : bucket) {
				if (pair.key.equals(key)) {
					bucket.remove(pair);
					break;
				}
			}
		}
	}

	private int keySpace;
	private List<Bucket> table;

	public MyHashMap() {
		keySpace = 1000;
		table = new ArrayList<>();
		for (int i = 0; i < keySpace; ++i) {
			table.add(new Bucket());
		}
	}

	public V get(K key) {
		int idx = key.hashCode() % keySpace;
		return table.get(idx).get(key);
	}

	public void put(K key, V value) {
		int idx = key.hashCode() % keySpace;
		table.get(idx).update(key, value);
	}

	public void remove(K key) {
		int idx = key.hashCode() % keySpace;
		table.get(idx).remove(key);
	}
}
