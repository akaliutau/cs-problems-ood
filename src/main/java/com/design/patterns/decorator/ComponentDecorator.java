package com.design.patterns.decorator;

public abstract class ComponentDecorator {
	protected Component component;

	// the same as inherited method, but decorator gives more flexibility
	// because one can omit some methods
	abstract void openURL();

	// newly added method
	abstract void close();
}
