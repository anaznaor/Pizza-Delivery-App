package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class KarijolaPizzeria implements PizzeriaService {
    @Value("${pizzeria.name}")
    private String name;
    @Value("${pizzeria.address}")
    private String address;
    private boolean open;
    private List<Pizza> menu;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of KarijolaPizzeria's doMyPostConstruct.");
        open = true;

        menu = new ArrayList<>();
        menu.add(new FruttiDiMare());
        menu.add(new Margherita());
        menu.add(new Prosciutto());
        menu.add(new Tonno());
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

    @Override
    public List<Pizza> getMenu() {
        return menu;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of KarijolaPizzeria's doMyPreDestroy");
    }
}