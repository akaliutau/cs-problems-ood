package com.design.patterns.composite;

import java.util.HashMap;
import java.util.Map;

public class DirNode implements Node {

	Map<String, Node> nodes = new HashMap<>();

	@Override
	public String info() {
		return "details about directory";
	}

	@Override
	public void add(String path, Node node) {
		nodes.put(path, node);
	}

}
