package com.agency04.sbss.pizza.model;

public class Prosciutto implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.HAM, PizzaIngredient.OREGANO};

    @Override
    public String getName() {
        return "Prosciutto";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }
}
