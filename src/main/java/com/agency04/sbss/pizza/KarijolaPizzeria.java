package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class KarijolaPizzeria implements PizzeriaService {
    @Value("${pizzeria.name}")
    private String name;
    @Value("${pizzeria.address}")
    private String address;
    private boolean open;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of KarijolaPizzeria's doMyPostConstruct.");
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
        PizzaIngredient[] ingredients = pizza.getIngredients();
        StringBuilder sb = new StringBuilder();
        sb.append("--> Pizzeria " + getName() + " started preparing " + pizza.getName() + ", required ingredients: ");
        for(var i: ingredients)
            sb.append(i + " ");
        return sb.toString();
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of KarijolaPizzeria's doMyPreDestroy");
    }
}