package com.design.patterns.state;

public class StateOff implements State {

	@Override
	public void turnOn(Device device) {
		device.setState(new StateOn());
	}

}
