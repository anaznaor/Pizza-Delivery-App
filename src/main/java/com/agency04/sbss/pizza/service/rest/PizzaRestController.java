package com.agency04.sbss.pizza.service.rest;

import com.agency04.sbss.pizza.service.impl.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaRestController {
    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to PizzaApp!";
    }

    @GetMapping("/pizzerias")
    public String getPizzerias(){
        return "Available pizzeria: " + pizzaDeliveryService.getPizzeriaService().getName();
    }
}
