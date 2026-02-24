package com.ecommerce.monolith.product.mapper;

import com.ecommerce.monolith.product.dto.CreateProductRequest;
import com.ecommerce.monolith.product.dto.ProductDTO;
import com.ecommerce.monolith.product.model.Product;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(Product product);
    Product toEntity(CreateProductRequest request);
    List<ProductDTO> toDTOList(List<Product> products);
}