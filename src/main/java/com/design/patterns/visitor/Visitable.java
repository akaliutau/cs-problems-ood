package com.design.patterns.visitor;

public interface Visitable {
	void accept(Visitor visitor);

	String getFileName();
}
