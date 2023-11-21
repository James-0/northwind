package com.example.northwind.customers;

import java.util.List;

import com.example.northwind.orders.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "customers")
public class Customer {

    @Id
    private String customer_id;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    private String company_name;
    private String contact_name;
    private String contact_title;
    private String address;
    private String city;
    private String region;
    private String postal_code;
    private String country;
    private String phone;
    private String fax;

}
