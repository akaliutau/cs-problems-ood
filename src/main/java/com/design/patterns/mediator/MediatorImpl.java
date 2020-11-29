package com.design.patterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class MediatorImpl implements Mediator {
	
	private Map<String, Participant> registrar = new HashMap<>();

	@Override
	public void register(Participant participant) {
		registrar.put(participant.getName(), participant);
	}

	@Override
	public void send(Message message) {
		// extract sender
		Participant sender = registrar.get(message.getSender());
		sender.onSend(message);
		// extract receiver
		Participant receiver = registrar.get(message.getRecepient());
		receiver.onReceive(message);
		
		message.setDelivered(true);
	}


}
