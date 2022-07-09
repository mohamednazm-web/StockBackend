package com.example.inventorymanagementsystem.controller;

import com.example.inventorymanagementsystem.entity.Stock;
import com.example.inventorymanagementsystem.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class StockController {

    @Autowired
    private StockService service;

    @PostMapping("/stockEntry")
    public Stock stockEntry(@RequestBody Stock request) {
        return service.saveStock(request);
    }

    @GetMapping("/stockEntry")
    public List<Stock> findAllStocks() {
        return service.getStocks();
    }

    @DeleteMapping("/stockEntry/delete/{series}")
    public int deleteStock(@PathVariable int series) {
        return service.deleteStock(series);
    }
}
