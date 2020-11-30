package com.design.patterns.specification;

public class NameSelector extends Selector<Dragon>{
	
	@Override
	public boolean test(Dragon t) {
		return t.name().startsWith("A");
	}

}
