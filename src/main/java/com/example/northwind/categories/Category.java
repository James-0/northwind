package com.example.northwind.categories;

import java.util.List;

import com.example.northwind.products.Products;

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
@Entity @Table(name = "categories")
public class Category {

    @Id
    private Integer category_id;

    // @OneToMany(mappedBy = "category")
    // private List<Products> products;
    
    private String category_name;
    private String description;



}
