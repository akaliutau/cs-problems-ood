package com.design.patterns.specification;

import java.util.Arrays;
import java.util.List;

public class ConjunctionSelector<T> extends Selector<T> {

    private final List<Selector<T>> leafComponents;

    @SafeVarargs
    ConjunctionSelector(Selector<T>... selectors) {
        this.leafComponents = Arrays.asList(selectors);
    }

    /**
     * All selectors must pass the test.
     */
    @Override
    public boolean test(T t) {
        return leafComponents.stream().allMatch(comp -> (comp.test(t)));
    }
}
