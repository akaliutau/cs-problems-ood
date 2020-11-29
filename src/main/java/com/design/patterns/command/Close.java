package com.design.patterns.command;

/**
 * Represents the object which actually performs the operation
 * @author akalu
 */

public class Close implements Command {
	
	private Receiver receiver;
	
	public Close(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exec() {
		System.out.println("performing close operation on receiver: " + receiver);
	}

}
