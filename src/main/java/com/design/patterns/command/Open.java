package com.design.patterns.command;

/**
 * Represents the object which actually performs the operation
 * @author akalu
 */

public class Open implements Command {
	
	private Receiver receiver;
	
	public Open(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exec() {
		System.out.println("performing open operation on receiver: " + receiver);
	}

}
