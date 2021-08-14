package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Service
public class PizzaDeliveryService {
    @Autowired
    private PizzeriaService pizzeriaService;
    private boolean available;
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of PizzaDelivery's doMyPostConstruct.");
        available = true;

        this.pizzaOrders.add(new PizzaOrder("Margharita", PizzaSize.SMALL, 2));
        this.pizzaOrders.add(new PizzaOrder("Capriciosa", PizzaSize.LARGE, 1));
        this.pizzaOrders.add(new PizzaOrder("Vegetariana", PizzaSize.MEDIUM, 3));
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

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }
}