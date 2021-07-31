package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class PizzaDeliveryService {
    @Autowired
    @Qualifier("maslinaPizzeria")
    private PizzeriaService maslinaPizzeria;
    @Autowired
    @Qualifier("karijolaPizzeria")
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

    public PizzeriaService getMaslinaPizzeria() {
        return maslinaPizzeria;
    }

    public PizzeriaService getKarijolaPizzeria() {
        return karijolaPizzeria;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of PizzaDelivery's doMyPreDestroy");
    }
}