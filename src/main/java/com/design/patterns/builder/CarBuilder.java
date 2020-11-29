package com.design.patterns.builder;

public class CarBuilder implements Builder {
	
	private Product product;

	@Override
	public CarBuilder addWheels(int numOfWheels) {
		product.setWheels(numOfWheels);
		return this;
	}

	@Override
	public CarBuilder paint(String color) {
		product.setColor(color);
		return this;
	}

	@Override
	public Product get() {
		return product;
	}

}
