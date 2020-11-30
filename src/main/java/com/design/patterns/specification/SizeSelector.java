package com.design.patterns.specification;

public class SizeSelector extends Selector<Dragon>{
	
	private int size;

	public SizeSelector(int size) {
		this.size = size;
	}

	@Override
	public boolean test(Dragon t) {
		return t.size() > size;
	}

}
