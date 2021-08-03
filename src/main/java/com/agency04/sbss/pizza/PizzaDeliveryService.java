package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class PizzaDeliveryService {
    @Autowired
    private PizzeriaService karijolaPizzeria;
    private boolean available;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of PizzaDelivery's doMyPostConstruct.");
        available = true;
    }
    public void orderPizza(Pizza pizza) {
        System.out.println("Order: " + pizza.getName());
    }

    public PizzeriaService getKarijolaPizzeria() {
        return karijolaPizzeria;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of PizzaDelivery's doMyPreDestroy");
    }
}