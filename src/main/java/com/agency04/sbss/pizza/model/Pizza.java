package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizza {
    @Id
    private String name;
    private PizzaIngredient[] pizzaIngredients;
    @OneToMany(mappedBy = "pizza")
    private List<PizzaOrder> pizzaOrders;

    public Pizza() {
    }

    public Pizza(String name, PizzaIngredient[] pizzaIngredients) {
        this.name = name;
        this.pizzaIngredients = pizzaIngredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaIngredients(PizzaIngredient[] pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public String getName() {
        return name;
    }

    public PizzaIngredient[] getPizzaIngredients() {
        return pizzaIngredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return this.getName() == pizza.getName();
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, pizzaOrders);
        result = 31 * result + Arrays.hashCode(pizzaIngredients);
        return result;
    }
}
