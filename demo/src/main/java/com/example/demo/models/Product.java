package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Product {
    private int Id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
