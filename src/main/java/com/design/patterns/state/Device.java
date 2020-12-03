package com.design.patterns.state;

/**
 * Driver class
 * Note that state is changed only if there is an actual need in transition, f.e. on -> off, etc
 * 
 * @author akalu
 *
 */
public class Device {
	State state = new StateOff();

	public void setState(State state) {
		this.state = state;
	}
	
	public void turnOn() {
		state.turnOn(this);
	}

	public void turnOff() {
		state.turnOff(this);
	}

}
