package com.design.patterns.interpreter;

import java.util.Stack;

public class Context {
	private Stack<Integer> stack = new Stack<>();
	
	public void and() {
		int arg1 = stack.pop();
		int arg2 = stack.pop();
		stack.add(arg1 & arg2);
	}

	public void add() {
		int arg1 = stack.pop();
		int arg2 = stack.pop();
		stack.add(arg1 + arg2);
	}

	public void add(int num) {
		stack.add(num);
	}
}
