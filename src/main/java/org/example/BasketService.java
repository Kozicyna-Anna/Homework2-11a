package org.example;


import org.example.service.Basket;

import java.util.Collection;
import java.util.List;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> ids) {
        basket.addItems(ids);
    }

    public Collection<Integer> get() {
        return basket.getItems();
    }
}

