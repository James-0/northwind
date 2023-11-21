package com.example.northwind.order_details;

import com.example.northwind.orders.Order;
import com.example.northwind.products.Products;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "order_details")
public class OrderDetails {
    @Id
    private Integer orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;


    private Double unit_price;

    private Integer quantity;

    // @Column(columnDefinition = "REAL")
    private Double discount;
}
