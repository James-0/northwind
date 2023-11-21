package com.example.northwind.orders;

import java.util.Date;
import java.util.List;

import com.example.northwind.customers.Customer;
import com.example.northwind.employee.Employee;
import com.example.northwind.order_details.OrderDetails;
import com.example.northwind.shippers.Shippers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity @Table(name = "orders")
public class Order {
    @Id
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;

    @Temporal(TemporalType.DATE)
    private Date order_date;

    @Temporal(TemporalType.DATE)
    private Date required_date;

    @Temporal(TemporalType.DATE)
    private Date shipped_date;

    @ManyToOne
    @JoinColumn(name = "ship_via")
    private Shippers ship_via;

    private Double freight;
    private String ship_name;
    private String ship_address;
    private String ship_city;
    private String ship_region;
    private String ship_postal_code;
    private String ship_country;
}
