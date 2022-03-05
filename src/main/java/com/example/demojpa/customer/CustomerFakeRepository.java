package com.example.demojpa.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Jason Bond", "password123"),
                new Customer(2L,"Jamie Bond", "password123"),
                new Customer(3L,"David Bond", "password123")
                );

    }
}
