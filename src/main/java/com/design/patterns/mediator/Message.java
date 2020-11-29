package com.design.patterns.mediator;

import java.io.Serializable;

public class Message implements Serializable{
	private static final long serialVersionUID = 2439594133528936814L;
	
	private final String text;
	private final String sender;
	private final String recepient;
	private boolean delivered = false;
	
	public Message(String text, String sender, String recepient) {
		this.text = text;
		this.sender = sender;
		this.recepient = recepient;
	}

	public String getText() {
		return text;
	}

	public String getSender() {
		return sender;
	}

	public String getRecepient() {
		return recepient;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

}
