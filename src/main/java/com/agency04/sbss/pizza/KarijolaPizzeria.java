package com.agency04.sbss.pizza;

public class KarijolaPizzeria implements PizzeriaService {
    private Pizza pizza;
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
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
        this.pizza = pizza;
        return "--> Pizzeria " + getName() + " is preparing " + pizza.getName() + ", required ingredients: " + pizza.getIngredients();
    }
}
