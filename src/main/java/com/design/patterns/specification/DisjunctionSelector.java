package com.design.patterns.specification;

import java.util.Arrays;
import java.util.List;

public class DisjunctionSelector<T> extends Selector<T> {

    private final List<Selector<T>> leafComponents;

    @SafeVarargs
    DisjunctionSelector(Selector<T>... selectors) {
        this.leafComponents = Arrays.asList(selectors);
    }

    /**
     * At least one selector must pass the test.
     */
    @Override
    public boolean test(T t) {
        return leafComponents.stream().anyMatch(comp -> (comp.test(t)));
    }
}
