package com.design.patterns.singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}
}
