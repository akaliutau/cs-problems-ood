package com.design.patterns.specification;

public abstract class AbstractCreature implements Creature {
	
	protected String name;
	protected int size;

	@Override
	public String name() {
		return name;
	}

	@Override
	public int size() {
		return size;
	}

}
