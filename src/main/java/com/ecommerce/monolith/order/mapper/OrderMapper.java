package com.ecommerce.monolith.order.mapper;

import com.ecommerce.monolith.order.dto.OrderRequest;
import com.ecommerce.monolith.order.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "orderDate", expression = "java(java.time.LocalDateTime.now())")
    Order toEntity(OrderRequest request);
}