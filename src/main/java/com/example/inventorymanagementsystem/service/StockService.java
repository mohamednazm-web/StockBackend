package com.example.inventorymanagementsystem.service;

import com.example.inventorymanagementsystem.entity.Stock;
import com.example.inventorymanagementsystem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository repository;

    public Stock saveStock(Stock stock) {
        return repository.save(stock);
    }

    public List<Stock> getStocks() {
        return repository.findAll();
    }

    public int deleteStock(int series) {
        repository.deleteById(series);
        return series;
    }
}
