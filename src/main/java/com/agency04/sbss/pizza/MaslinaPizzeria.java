package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MaslinaPizzeria implements PizzeriaService {
    private Pizza pizza;
    @Value("Maslina")
    private String name;
    @Value("Stupnicka ul. 14, 10000 Zagreb")
    private String address;

    /*
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    */

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
        this.pizza = pizza;
        return "--> Pizzeria " + getName() + " is preparing " + pizza.getName() + ", required ingredients: " + pizza.getIngredients();
    }

}
