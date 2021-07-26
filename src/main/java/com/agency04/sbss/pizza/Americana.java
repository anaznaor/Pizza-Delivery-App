package com.agency04.sbss.pizza;

import java.util.Arrays;

public class Americana implements Pizza{
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.SAUSAGE, PizzaIngredient.FRENCH_FRIES};

    @Override
    public String getName() {
        return "Americana";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }
}
