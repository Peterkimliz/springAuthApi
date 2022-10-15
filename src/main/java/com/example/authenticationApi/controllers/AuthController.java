package com.example.authenticationApi.controllers;

import com.example.authenticationApi.dto.CustomerDto;
import com.example.authenticationApi.models.Customer;
import com.example.authenticationApi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Validated CustomerDto customerDto) {
        return new ResponseEntity<Customer>(customerService.createCustomer(customerDto), HttpStatus.CREATED);
    }
//    @PostMapping("/login")
//    public ResponseEntity<Customer> loginCustomer(@RequestBody @Validated CustomerDto customerDto) {
//        return new ResponseEntity<Customer>(customerService.createCustomer(customerDto), HttpStatus.CREATED);
//    }



}
