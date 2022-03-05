package com.example.demojpa.customer;

import com.example.demojpa.DemoJpaApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping
    Customer getCustomer(){
        return new Customer(1L,"Jason Bond");
    }

}
