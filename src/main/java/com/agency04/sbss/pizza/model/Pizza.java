package com.agency04.sbss.pizza.model;

public interface Pizza {
    public String getName();

    public PizzaIngredient[] getIngredients();

    public PizzaSize[] getSizes();
}
