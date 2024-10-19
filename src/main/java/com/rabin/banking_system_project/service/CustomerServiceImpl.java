package com.rabin.banking_system_project.service;

import com.rabin.banking_system_project.dto.CustomerDto;
import com.rabin.banking_system_project.entity.Customer;
import com.rabin.banking_system_project.exception.CustomerAlreadyExistException;
import com.rabin.banking_system_project.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public CustomerDto savingTheCustomerRecord(CustomerDto customerDto) {
        Optional<Customer> existCustomer = customerRepository.findByEmail(customerDto.getEmail().toLowerCase());
        if (existCustomer.isPresent()) {
            throw new CustomerAlreadyExistException("Customer Record is already exist");
        }
        Customer customer = new Customer();
        customer.setName(customerDto.getName().toLowerCase());
        customer.setAddress(customerDto.getAddress().toLowerCase());
        customer.setEmail(customerDto.getEmail().toLowerCase());
        customer.setPassword(customerDto.getPassword());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setUsername(customerDto.getUsername().toLowerCase());
        customer.setCreateDate(new Date());
        customer.setModifiedDate(new Date());
        
        Customer customer1 = customerRepository.save(customer);

        CustomerDto customerDto1 = new CustomerDto();
        BeanUtils.copyProperties(customer1, customerDto1);

        return customerDto1;
    }
}
