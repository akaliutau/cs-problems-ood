package com.design.patterns.mediator;

public interface Mediator {
	void register(Participant participant);
	void send(Message message);
}
