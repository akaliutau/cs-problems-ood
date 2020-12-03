package com.design.patterns.property;

public interface Prototype {
    Integer get(Trait trait);
    void set(Trait trait, Integer val);
    boolean has(Trait trait);
}
