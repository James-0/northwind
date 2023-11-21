package com.example.northwind.region;

import java.util.List;

import com.example.northwind.territories.Territories;

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
@Entity @Table(name = "region")
public class Region {

    @Id
    private Integer region_id;

    @OneToMany(mappedBy = "region")
    private List<Territories> territories;

    private String region_description;
}
