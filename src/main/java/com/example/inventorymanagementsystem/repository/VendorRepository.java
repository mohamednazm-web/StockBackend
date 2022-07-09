package com.example.inventorymanagementsystem.repository;

import com.example.inventorymanagementsystem.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
