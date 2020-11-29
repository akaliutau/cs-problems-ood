package com.design.patterns.strategy;

import java.util.HashMap;
import java.util.Map;
import static com.design.patterns.strategy.Operation.*;

public class Context {
	private static Map<Operation, Strategy> operations = new HashMap<>();
	static {
		operations.put(ADD, new Addition());
		operations.put(XOR, new Xor());
		operations.put(SUB, new Substraction());
	}

	// the same as inherited method, but strategy gives more flexibility
	// because one can compose complex methods without increasing of number of base
	// classes
	public int calc(Operation op, int arg1, int arg2) {
		return operations.get(op).calc(arg1, arg2);
	}
}
