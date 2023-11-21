package com.example.northwind.employee_territories;

import jakarta.persistence.Embeddable;
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
@Embeddable @Table(name = "employee_territories")
public class EmployeeTerriroties {

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Integer employee_id;

    @ManyToOne
    @JoinColumn(name = "territory_id")
    private String territory_id;
}
