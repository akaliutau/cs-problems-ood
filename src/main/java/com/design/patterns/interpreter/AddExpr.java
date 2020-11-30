package com.design.patterns.interpreter;

public class AddExpr implements Expression {
	
	@Override
	public void eval(Context context) {
		context.add();
	}

}