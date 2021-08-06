package com.agency04.sbss.pizza.model;

public class Vegetariana implements Pizza {
    private PizzaIngredient[] ingredients =
    {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.VARIOUS_VEGETABLES};

    @Override
    public String getName() {
        return "Vegetariana";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }

}
