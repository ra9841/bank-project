package com.rabin.banking_system_project.controller;

import com.rabin.banking_system_project.dto.CustomerDto;
import com.rabin.banking_system_project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    private ResponseEntity<CustomerDto> registrationOfCustomerRecord(@RequestBody CustomerDto customerDto){
     return ResponseEntity.ok(customerService.savingTheCustomerRecord(customerDto));
    }
}
