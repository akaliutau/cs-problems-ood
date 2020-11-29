package com.design.patterns.observer;

public class SlaveHandler implements Observer {

	@Override
	public void update(Observable observable) {
		System.out.println(String.format("Changes in % is handled by Master", observable));
	}

}
