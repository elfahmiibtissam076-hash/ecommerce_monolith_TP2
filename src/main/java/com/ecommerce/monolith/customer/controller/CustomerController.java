package com.ecommerce.monolith.customer.controller;

import com.ecommerce.monolith.customer.dto.CustomerDTO;
import com.ecommerce.monolith.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getAll() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomerDTO create(@RequestBody CustomerDTO dto) {
        return customerService.createCustomer(dto);
    }

    @PutMapping("/{id}")
    public CustomerDTO update(@PathVariable Long id, @RequestBody CustomerDTO dto) {
        return customerService.updateCustomer(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}