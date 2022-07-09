package com.example.inventorymanagementsystem.repository;

import com.example.inventorymanagementsystem.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
