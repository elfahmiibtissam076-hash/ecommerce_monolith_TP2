package com.ecommerce.monolith.order.service;

import com.ecommerce.monolith.customer.service.CustomerService; // التواصل مع موديول الزبناء [cite: 152]
import com.ecommerce.monolith.order.dto.OrderRequest;
import com.ecommerce.monolith.order.mapper.OrderMapper;
import com.ecommerce.monolith.order.model.Order;
import com.ecommerce.monolith.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final CustomerService customerService;

    @Override
    public Order createOrder(OrderRequest request) throws Exception {

        if (!customerService.existsById(request.getCustomerId())) {
            throw new Exception("Customer not found!");
        }

        Order order = orderMapper.toEntity(request);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrdersByCustomer(Long customerId) {

        return orderRepository.findByCustomerId(customerId);
    }
}