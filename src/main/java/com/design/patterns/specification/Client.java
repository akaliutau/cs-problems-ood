package com.design.patterns.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        Selector<Dragon> filterBySize = new SizeSelector(10);
        filterBySize.and(new NameSelector());
        List<Dragon> creatures = new ArrayList<>();
        creatures.stream().filter(filterBySize).collect(Collectors.toList());
    }

}
