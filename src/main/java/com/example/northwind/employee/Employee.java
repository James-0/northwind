package com.example.northwind.employee;

import java.util.Date;
import java.util.List;

import com.example.northwind.orders.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "employees")
public class Employee {
    @Id
    private Integer employee_id;

    @OneToMany(mappedBy = "employee")
    private List<Order> order;

    private String first_name;
    private String title;
    private String title_of_courtesy;

    @Temporal(TemporalType.DATE)
    private Date birth_date;

    @Temporal(TemporalType.DATE)
    private Date hire_date;
    private String address;
    private String city;
    private String region;
    private String postal_code;
    private String country;
    private String home_phone;
    private String extension;
    private String notes;
    private Integer reports_to;
    private String photo_path;
}
