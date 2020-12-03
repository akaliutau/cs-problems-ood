package com.design.patterns.command;

/**
 * Invoking object
 * 
 * @author akalu
 */
public class Invoker {
	private Command command;// can be a list of Commands

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void invoke() {
		command.exec(new Receiver());
	}
}
