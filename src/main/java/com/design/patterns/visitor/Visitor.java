package com.design.patterns.visitor;

public interface Visitor {
	void visit(Visitable visitable);

	void read(String file);
}
