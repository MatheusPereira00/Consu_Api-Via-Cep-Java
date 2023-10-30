package com.matheus.api.model;

import lombok.Data;

@Data
public class Products {
    private String id;
    private String title;
    private String description;
    private String price;
    private String discountPercentage;
    private String rating;
    private String stock;
    private String brand;
    private String category;
    private String thumbnail;
    private String images;
}
