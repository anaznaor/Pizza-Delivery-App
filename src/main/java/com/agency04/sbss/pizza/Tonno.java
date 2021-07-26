package com.agency04.sbss.pizza;

public class Tonno implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.TUNA, PizzaIngredient.ONIONS};

    @Override
    public String getName() {
        return "Tonno";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }
}
