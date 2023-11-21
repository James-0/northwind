package com.example.northwind.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    @Autowired
    public CustomerService() {
        
    }

    public List<Customer> getCustomers() {
        return null;
    }

    
    
}
