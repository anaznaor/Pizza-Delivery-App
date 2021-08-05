package com.agency04.sbss.pizza.model;

public class Margherita implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.OREGANO};

    public String getName() {
        return "Margherita";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }
}
