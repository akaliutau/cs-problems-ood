package com.design.patterns.composite;

public interface Node {
	String info();

	default void add(String path, Node node) {
	};
}
