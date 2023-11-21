package com.example.northwind.suppliers;

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
@Entity @Table(name = "suppliers")
public class Supplier {
    @Id
    private Integer supplier_id;


    @OneToMany(mappedBy = "supplier")
    private List<Products> products;
    
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
    private String homepage;
}
