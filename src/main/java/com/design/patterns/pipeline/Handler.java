package com.design.patterns.pipeline;

public interface Handler<I, O> {
	O process(I input);
}
