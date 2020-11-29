package com.design.patterns.visitor;

/**
 * Implements what to do with visitable object
 * 
 * @author Alex
 */
public class VisitorImpl implements Visitor {

	@Override
	public void visit(Visitable visitable) {
		visitable.accept(this);
	}

	@Override
	public void read(String file) {
		System.out.println("reading file " + file);
	}

}
