package com.example.northwind.territories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TerritoriesController {
    private final TerritoriesService territoriesService;

    @Autowired 
    public TerritoriesController(TerritoriesService territoriesService) {
        this.territoriesService = territoriesService;
    }

    
}
