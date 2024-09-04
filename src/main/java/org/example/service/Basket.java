package org.example.service;


import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final Set<Integer> items = new HashSet<>();

    public void addItems(List<Integer> ids) {
        items.addAll(ids);
    }
    public Collection<Integer> getItems() {
        return Collections.unmodifiableSet(items);
    }
}
