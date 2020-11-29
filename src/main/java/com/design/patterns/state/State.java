package com.design.patterns.state;

public interface State {
	default void turnOn(Device device) {}
	default void turnOff(Device device) {}
}
