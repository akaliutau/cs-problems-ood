package com.design.patterns.state;

public class StateOn implements State {

	@Override
	public void turnOff(Device device) {
		device.setState(new StateOff());
	}

}
