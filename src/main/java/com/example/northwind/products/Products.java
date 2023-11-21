package com.example.northwind.products;

import com.example.northwind.categories.Category;
import com.example.northwind.suppliers.Supplier;

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
@Entity @Table(name = "products")
public class Products {

    @Id
    private Integer product_id;

    private String product_name;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String quantity_per_unit;
    private Double unit_price;
    private Integer units_in_stock;
    private Integer units_on_order;
    private Integer reorder_level;
    private Integer discontinued;
}
