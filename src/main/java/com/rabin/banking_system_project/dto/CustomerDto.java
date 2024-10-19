package com.rabin.banking_system_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    private Long id;
    private String name;
    private String address;
    private Date createDate;
    private Date modifiedDate;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
}
