package com.design.patterns.abstractfactory;

public class Apple implements Fruit {

	@Override
	public String color() {
		return "Red";
	}

	@Override
	public int size() {
		return 50;
	}

}
