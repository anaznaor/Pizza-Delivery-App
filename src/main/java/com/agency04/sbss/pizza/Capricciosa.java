package com.agency04.sbss.pizza;

public class Capricciosa implements Pizza{
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.HAM, PizzaIngredient.ARTICHOKES, PizzaIngredient.MUSHROOMS, PizzaIngredient.OLIVES};

    @Override
    public String getName() {
        return "Capricciosa";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }
}
