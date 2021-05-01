package com.design.patterns.command;

/**
 * Represents the object which actually performs the operation
 * @author akaliutau
 */

public class Open implements Command {
	
	@Override
	public void exec(Receiver receiver) {
		System.out.println("performing open operation on receiver: " + receiver);
	}

}
