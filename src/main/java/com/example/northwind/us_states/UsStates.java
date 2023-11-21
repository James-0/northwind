package com.example.northwind.us_states;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "us_states")
public class UsStates {
    @Id
    private Integer state_id;
    private String state_name;
    private String state_abbr;
    private String state_region;
}
