package com.example.inventorymanagementsystem.service;

import com.example.inventorymanagementsystem.entity.Item;
import com.example.inventorymanagementsystem.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository repository;

    public Item saveStock(Item stock) {
        return repository.save(stock);
    }

    public List<Item> getItems() {
        return repository.findAll();
    }
}
