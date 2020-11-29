package com.design.patterns.pipeline;

public interface Pipeline<I, O> {
	Pipeline<I, O> addHandler(Handler<I, O> handler);
	O exec(I input);
}
