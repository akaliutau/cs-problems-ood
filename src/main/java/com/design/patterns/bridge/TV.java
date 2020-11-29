package com.design.patterns.bridge;

public class TV extends Gadget {

	@Override
	void turnOn() {
		state = State.ACTIVE;
	}

	@Override
	void turnOff() {
		state = State.OFF;
	}

	@Override
	void standBy() {
		state = State.STANDBY;
	}

}
