package com.design.patterns.memento;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class serves as a guardian
 * @author akaliutau
 */
public class Caretaker {
	private Queue<Memento> history = new LinkedList<>();
	
	public void add(Memento m) {
		history.add(m);
	}
	
	public Memento poll() {
		return history.poll();
	}
}
