package com.example.inventorymanagementsystem.controller;

import com.example.inventorymanagementsystem.entity.Vendor;
import com.example.inventorymanagementsystem.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class VendorController {

    @Autowired
    private VendorService service;

    @PostMapping("/Vendor")
    public Vendor createVendor(@RequestBody Vendor request) {
        return service.saveVendor(request);
    }

    @GetMapping("/Vendor")
    public List<Vendor> findAllVendors() {
        return service.getVendors();
    }
}
