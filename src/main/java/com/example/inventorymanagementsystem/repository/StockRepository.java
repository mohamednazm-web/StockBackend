package com.example.inventorymanagementsystem.repository;

import com.example.inventorymanagementsystem.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
