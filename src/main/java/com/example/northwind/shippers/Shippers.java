package com.example.northwind.shippers;

import java.util.List;

import com.example.northwind.orders.Order;

import jakarta.persistence.Column;
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
@Entity @Table(name = "shippers")
public class Shippers {

    @Id
    @Column(length = 1)
    private Integer shipper_id;

    @OneToMany(mappedBy = "ship_via")
    private List<Order> order;

    private String company_name;
    private String phone;
}
