package com.design.patterns.mediator;

public abstract class Participant {
	protected String name;
	
	public String getName() {
		return name;
	}
	
	abstract void onReceive(Message message);
	abstract void onSend(Message message);
}
