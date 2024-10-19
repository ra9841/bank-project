package com.rabin.banking_system_project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Customer_tbl")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @Id
    private Long id;
    @Column(name = "customer_name", nullable = false)
    private String name;
    @Column(name = "customer_address", nullable = false)
    private String address;
    @Column(name = "customer_createDate", nullable = false)
    private Date createDate;
    @Column(name = "customer_modifiedDate", nullable = false)
    private Date modifiedDate;
    @Column(name = "customer_dOB", nullable = false)
    private String phoneNumber;
    @Column(name = "customer_email", nullable = false)
    private String email;
    @Column(name = "customer_username", nullable = false)
    private String username;
    @Column(name = "customer_password", nullable = false)
    private String password;
}
