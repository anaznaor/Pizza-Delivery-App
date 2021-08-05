package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class PizzaDeliveryService {
    @Autowired
    private PizzeriaService pizzeriaService;
    private boolean available;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of PizzaDelivery's doMyPostConstruct.");
        available = true;
    }
    public void orderPizza(Pizza pizza) {
        System.out.println("Order: " + pizza.getName() + " in pizzeria " + pizzeriaService.getName());
    }

    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of PizzaDelivery's doMyPreDestroy");
    }
}