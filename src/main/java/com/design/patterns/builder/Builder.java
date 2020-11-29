package com.design.patterns.builder;

public interface Builder {
	Product get();
	CarBuilder paint(String color);
	CarBuilder addWheels(int numOfWheels);
}
