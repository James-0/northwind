package com.example.northwind.shippers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ShippersController {
    private ShippersService shippersService;

    @Autowired
    public ShippersController(ShippersService shippersService) {
        this.shippersService = shippersService;
    }

    
}
