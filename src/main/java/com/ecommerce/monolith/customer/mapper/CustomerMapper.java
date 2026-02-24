package com.ecommerce.monolith.customer.mapper;

import com.ecommerce.monolith.customer.dto.CustomerDTO;
import com.ecommerce.monolith.customer.model.Customer;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toEntity(CustomerDTO customerDTO);
    CustomerDTO toDTO(Customer customer);
    List<CustomerDTO> toDTOList(List<Customer> customers);
}