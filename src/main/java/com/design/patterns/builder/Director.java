package com.design.patterns.builder;

public class Director {
	
	Product construct(Builder builder) {
		Product product = builder.addWheels(4).paint("yellow").get();
		return product;
	}
	
}
