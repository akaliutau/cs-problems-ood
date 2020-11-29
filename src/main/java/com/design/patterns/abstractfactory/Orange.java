package com.design.patterns.abstractfactory;

public class Orange implements Fruit {

	@Override
	public String color() {
		return "Yellow";
	}

	@Override
	public int size() {
		return 40;
	}

}
