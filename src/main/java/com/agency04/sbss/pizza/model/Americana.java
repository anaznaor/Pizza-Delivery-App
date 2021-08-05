package com.agency04.sbss.pizza.model;

public class Americana implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.SAUSAGE, PizzaIngredient.FRENCH_FRIES};

    @Override
    public String getName() {
        return "Americana";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }
}
