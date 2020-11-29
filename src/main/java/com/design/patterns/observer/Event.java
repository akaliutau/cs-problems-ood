package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Event implements Observable {

	private long id;
	private State state = State.NOTSTARED;
	private List<Observer> observers = new ArrayList<>();

	public Event(long id) {
		this.id = id;
	}

	@Override
	public void setChanged(State state) {
		this.state = state;
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", state=" + state + "]";
	}

}
