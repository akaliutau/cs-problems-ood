package com.design.patterns.bridge;

public enum State {
	OFF(0), ACTIVE(1), STANDBY(2);

	private int index;

	private State(int index) {
		this.index = index;
	}

}
