package com.design.patterns.observer;

public interface Observable {
	void addObserver(Observer observer);

	void notifyObservers();

	void setChanged(State state);
}
