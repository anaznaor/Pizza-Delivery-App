package com.agency04.sbss.pizza;

public class QuattroFormaggi implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.GORGONZOLA_CHEESE, PizzaIngredient.ARTICHOKES, PizzaIngredient.OREGANO};

    @Override
    public String getName() {
        return "Quattro Formaggi";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }
}
