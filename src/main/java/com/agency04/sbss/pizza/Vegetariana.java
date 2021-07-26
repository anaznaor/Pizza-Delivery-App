package com.agency04.sbss.pizza;

public class Vegetariana implements Pizza {
    private PizzaIngredient[] ingredients =
    {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.VARIOUS_VEGETABLES};

    @Override
    public String getName() {
        return "Vegetariana";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }

}
