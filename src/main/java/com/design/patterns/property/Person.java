package com.design.patterns.property;

import java.util.HashMap;
import java.util.Map;

public class Person implements Prototype{
    private String fullName;
    private String address;
    private Map<Trait,Integer> profile = new HashMap<>();
    
    public Person(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public Integer get(Trait trait) {
        return profile.get(trait);
    }

    @Override
    public void set(Trait trait, Integer val) {
        profile.put(trait, val);
    }

    @Override
    public boolean has(Trait trait) {
        return profile.containsKey(trait);
    }

}
