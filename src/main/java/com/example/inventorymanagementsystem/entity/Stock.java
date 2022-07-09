package com.example.inventorymanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private int series;
    private int stockLevel;
    private String purpose;
    private Date postingDate;
    private String items;
    private String currency;
    private boolean IsOpening;
    private String remarks;
    private int vendor_id;
}