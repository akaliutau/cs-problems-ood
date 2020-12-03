package com.design.patterns.specification;

import java.util.function.Predicate;

public abstract class Selector<T> implements Predicate<T> {
    public Selector<T> and(Selector<T> other) {
        return new ConjunctionSelector<>(this, other);
    }

    public Selector<T> or(Selector<T> other) {
        return new DisjunctionSelector<>(this, other);
    }

    public Selector<T> not() {
        return new NegationSelector<>(this);
    }
}
