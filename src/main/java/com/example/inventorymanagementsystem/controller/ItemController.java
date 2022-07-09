package com.example.inventorymanagementsystem.controller;

import com.example.inventorymanagementsystem.entity.Item;
import com.example.inventorymanagementsystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ItemController {

    @Autowired
    private ItemService service;

    @PostMapping("/Item")
    public Item stockEntry(@RequestBody Item request) {
        return service.saveStock(request);
    }

    @GetMapping("/Item")
    public List<Item> findAllItems() {
        return service.getItems();
    }
}
