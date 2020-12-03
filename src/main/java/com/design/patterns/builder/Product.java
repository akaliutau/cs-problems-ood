package com.design.patterns.builder;

public class Product {

	private String color;
	private int wheels;

	public void setColor(String color) {
		this.color = color;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Product [color=" + color + ", wheels=" + wheels + "]";
	}

}
