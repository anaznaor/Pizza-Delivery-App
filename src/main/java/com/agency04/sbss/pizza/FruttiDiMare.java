package com.agency04.sbss.pizza;

public class FruttiDiMare implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.SEAFOOD};

    @Override
    public String getName() {
        return "Frutti di Mare";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }

}
