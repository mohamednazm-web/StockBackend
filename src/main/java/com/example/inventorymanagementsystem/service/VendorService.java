package com.example.inventorymanagementsystem.service;

import com.example.inventorymanagementsystem.entity.Vendor;
import com.example.inventorymanagementsystem.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepository repository;

    public Vendor saveVendor(Vendor vendor) {
        System.out.println("vendor" + vendor);
        return repository.save(vendor);
    }

    public List<Vendor> getVendors() {
        return repository.findAll();
    }
}
