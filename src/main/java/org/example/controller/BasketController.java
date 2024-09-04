package org.example.controller;

import org.example.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> ids) {
        service.add(ids);

    }
    @GetMapping("/get")
    public Collection<Integer> get() {
        return service.get();
    }
}