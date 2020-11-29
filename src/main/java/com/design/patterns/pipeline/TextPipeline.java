package com.design.patterns.pipeline;

import java.util.ArrayList;
import java.util.List;

public class TextPipeline implements Pipeline<String, String> {

	List<Handler<String, String>> handlers = new ArrayList<>();

	@Override
	public String exec(String input) {
		String in = input;
		for (Handler<String, String> handler : handlers) {
			String out = handler.process(in);
			in = out;// in real use cases there is a need in type transformers
		}
		return in;
	}

	@Override
	public Pipeline<String, String> addHandler(Handler<String, String> handler) {
		handlers.add(handler);
		return this;
	}

}
