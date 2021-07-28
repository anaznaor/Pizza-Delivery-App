package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaDeliveryService {
    @Autowired
    @Qualifier("maslinaPizzeria")
    private PizzeriaService maslinaPizzeria;
    @Autowired
    @Qualifier("karijolaPizzeria")
    private PizzeriaService karijolaPizzeria;

    public void orderPizza(Pizza pizza) {
        System.out.println("Order: " + pizza.getName());
    }

    public PizzeriaService getMaslinaPizzeria() {
        return maslinaPizzeria;
    }

    public PizzeriaService getKarijolaPizzeria() {
        return karijolaPizzeria;
    }
}
