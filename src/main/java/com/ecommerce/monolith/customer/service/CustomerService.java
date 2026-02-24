package com.ecommerce.monolith.customer.service;

import com.ecommerce.monolith.customer.dto.CustomerDTO;
import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
    void deleteCustomer(Long id);


    boolean existsById(Long id);
}