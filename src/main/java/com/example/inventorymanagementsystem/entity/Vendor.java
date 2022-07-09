package com.example.inventorymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Vendor {
    @Id
    @GeneratedValue
    private int series;
    private String name;
    private String address;
    private String phone;

    @OneToMany(targetEntity = Stock.class, cascade = CascadeType.ALL)
    @JoinColumn(name="vendor_id", referencedColumnName = "series")
    private List<Stock> stocks;
}
