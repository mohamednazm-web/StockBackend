package com.example.inventorymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue
    private int series;
    private String name;
    private String code;
    private String barcode;
    private String description;
    private double price;
    private String defaultUom;
    private boolean is_bundle;
    private int item_group_id;
    private boolean forSell;
}
