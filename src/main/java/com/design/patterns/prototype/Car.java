package com.design.patterns.prototype;

public abstract class Car {
	protected String brand;
	protected int price;
	
	protected abstract Car clone();
}
