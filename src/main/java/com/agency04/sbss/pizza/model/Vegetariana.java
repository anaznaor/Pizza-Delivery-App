package com.agency04.sbss.pizza.model;

public class Vegetariana implements Pizza {
    private String name = "Vegetariana";

    private PizzaIngredient[] ingredients =
    {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.VARIOUS_VEGETABLES};

    private PizzaSize[] sizes = {PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }

    @Override
    public PizzaSize[] getSizes() {
        return sizes;
    }

    @Override
    public String toString() {
        return "Vegetariana";
    }
}
