package com.agency04.sbss.pizza;

public class QuattroStagioni implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.MUSHROOMS, PizzaIngredient.OLIVES, PizzaIngredient.OREGANO};

    @Override
    public String getName() {
        return "Quattro Stagioni";
    }

    @Override
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for(var ingredient: ingredients)
            sb.append(ingredient.toString() + " ");
        return sb.toString();
    }

}
