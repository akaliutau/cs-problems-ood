package com.design.patterns.interpreter;

public class NumberExpr implements Expression {
	
	private final int num;
	public NumberExpr(int num) {
		this.num = num;
	}

	@Override
	public void eval(Context context) {
		context.add(num);
	}

}
