package com.design.patterns.pipeline;

public class AttachHead implements Handler<String, String> {

	@Override
	public String process(String input) {
		return "Head" + input;
	}

}
