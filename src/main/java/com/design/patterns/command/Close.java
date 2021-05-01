package com.design.patterns.command;

/**
 * Represents the object which actually performs the operation
 * @author akaliutau
 */

public class Close implements Command {
	
	@Override
	public void exec(Receiver receiver) {
		System.out.println("performing close operation on receiver: " + receiver);
	}

}
