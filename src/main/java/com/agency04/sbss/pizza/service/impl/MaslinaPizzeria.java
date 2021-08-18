package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class MaslinaPizzeria implements PizzeriaService {
    @Value("Maslina")
    private String name;
    @Value("Stupnicka ul. 14, 10000 Zagreb")
    private String address;
    private boolean open;
    private List<Pizza> menu;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of MaslinaPizzeria's doMyPostConstruct.");
        open = true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        PizzaIngredient[] ingredients = pizza.getPizzaIngredients();
        StringBuilder sb = new StringBuilder();
        sb.append("--> Pizzeria " + getName() + " started preparing " + pizza.getName() + ", required ingredients: ");
        for(var i: ingredients)
            sb.append(i + " ");
        return sb.toString();
    }

    @Override
    public List<Pizza> getMenu() {
        return menu;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of MaslinaPizzeria's doMyPreDestroy");
    }
}
