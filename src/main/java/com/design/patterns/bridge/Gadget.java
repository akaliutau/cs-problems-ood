package com.design.patterns.bridge;

/**
 * A bridge class, a point of meeting, which connects refined abstractions with
 * interfaces describing state Enum in this case
 * 
 * @author akaliutau
 */
public abstract class Gadget {
	protected State state;

	abstract void turnOn();

	abstract void turnOff();

	abstract void standBy();
}
