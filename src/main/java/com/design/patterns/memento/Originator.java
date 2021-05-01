package com.design.patterns.memento;

/**
 * The system play the role of state machine
 * This class must implement the inner mechanism of saving/restoring the state
 * 
 * @author akaliutau
 *
 */
public class Originator {
	// this field describes the state of the whole system
	// potentially could be a set of fields, hence the use of Memento object
	String state;
	Caretaker caretaker;
	
	public void memorise() {
		Memento m = new Memento();
		m.setState(state);
		caretaker.add(m);
	}
	
	public void rollback() {
		state = caretaker.poll().getState();
	}
	

}
