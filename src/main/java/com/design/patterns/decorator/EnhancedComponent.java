package com.design.patterns.decorator;

public class EnhancedComponent extends ComponentDecorator {

	@Override
	public void openURL() {
		this.component.openURL();
	}

	@Override
	public void close() {
		System.out.println("close page in browser");
	}

}
