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
public class ItemGroup {
    @Id
    @GeneratedValue
    private int series;
    private String name;

    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    @JoinColumn(name="item_group_id", referencedColumnName = "series")
    private List<Item> items;
}
