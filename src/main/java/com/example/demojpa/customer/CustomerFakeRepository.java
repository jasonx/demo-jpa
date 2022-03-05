package com.example.demojpa.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Jason Bond"),
                new Customer(2L,"Jamie Bond"),
                new Customer(3L,"David Bond")
                );

    }
}
