package com.design.patterns.strategy;

public class Addition implements Strategy {

	@Override
	public int calc(int arg1, int arg2) {
		return arg1 + arg2;
	}

}
