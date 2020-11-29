package com.design.patterns.memento;

import java.util.LinkedList;
import java.util.Queue;

public class Caretaker {
	private Queue<Memento> history = new LinkedList<>();
	
	public void add(Memento m) {
		history.add(m);
	}
	
	public Memento poll() {
		return history.poll();
	}
}
