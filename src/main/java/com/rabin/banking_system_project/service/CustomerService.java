package com.rabin.banking_system_project.service;

import com.rabin.banking_system_project.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto savingTheCustomerRecord(CustomerDto customerDto);

    List<CustomerDto> listOfCustomerRecord();

    String deletingTheRecordByEmail(String email);


    CustomerDto getParticularCustomerRecord(String email);

    CustomerDto updatingTheCustomerRecord(CustomerDto customerDto, String email);
}
