package com.design.patterns.abstractfactory;

public class OrangeFactory extends CannedFruitFactory {

	@Override
	Fruit get() {
		return new Orange();
	}

}
