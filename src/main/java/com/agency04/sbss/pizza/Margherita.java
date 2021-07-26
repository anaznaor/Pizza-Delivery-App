package com.agency04.sbss.pizza;

public class Margherita implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.OREGANO};

    public String getName() {
        return "Margherita";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }
}
