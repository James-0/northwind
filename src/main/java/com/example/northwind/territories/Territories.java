package com.example.northwind.territories;

import com.example.northwind.region.Region;

import jakarta.persistence.Column;
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
@Entity @Table(name = "territories")
public class Territories {
    @Id
    private String territory_id;

    @Column
    private String territory_description;
    
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
