package com.ecommerce.monolith.order.service;

import com.ecommerce.monolith.order.dto.OrderRequest;
import com.ecommerce.monolith.order.model.Order;
import java.util.List;

public interface OrderService {

    Order createOrder(OrderRequest request) throws Exception;


    List<Order> getOrdersByCustomer(Long customerId);
}