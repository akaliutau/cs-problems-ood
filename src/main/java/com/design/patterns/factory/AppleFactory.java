package com.design.patterns.factory;

public class AppleFactory extends CannedFruitFactory {

	@Override
	Fruit get() {
		return new Apple();
	}

}
