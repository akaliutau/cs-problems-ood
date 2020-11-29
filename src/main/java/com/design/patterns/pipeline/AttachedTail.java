package com.design.patterns.pipeline;

public class AttachedTail implements Handler<String, String> {

	@Override
	public String process(String input) {
		return input + "tail";
	}

}
