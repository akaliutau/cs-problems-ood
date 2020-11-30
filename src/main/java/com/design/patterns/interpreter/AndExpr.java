package com.design.patterns.interpreter;

public class AndExpr implements Expression {
	
	@Override
	public void eval(Context context) {
		context.and();
	}

}
