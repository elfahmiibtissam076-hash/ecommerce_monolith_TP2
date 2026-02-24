package com.ecommerce.monolith.product.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
}