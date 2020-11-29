package com.design.patterns.abstractfactory;

public class AppleFactory extends CannedFruitFactory {

	@Override
	Fruit get() {
		return new Apple();
	}

}
