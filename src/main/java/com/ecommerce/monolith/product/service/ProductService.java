package com.ecommerce.monolith.product.service;

import com.ecommerce.monolith.product.dto.CreateProductRequest;
import com.ecommerce.monolith.product.dto.ProductDTO;
import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO createProduct(CreateProductRequest request);
}