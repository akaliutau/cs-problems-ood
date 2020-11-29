package com.design.patterns.prototype;

public class BasicCar extends Car {

	@Override
	public BasicCar clone() {
		BasicCar car = new BasicCar();
		car.brand = "Ford";
		car.price = 27000;
		return car;
	}
}
