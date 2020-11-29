package com.design.patterns.proxy;

public class ConcreteSubject extends Subject {

	@Override
	public void doSomething() {
		System.out.println("perform real action");
	}

}
