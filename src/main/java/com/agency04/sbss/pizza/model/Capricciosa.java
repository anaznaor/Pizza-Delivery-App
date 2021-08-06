package com.agency04.sbss.pizza.model;

public class Capricciosa implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.HAM, PizzaIngredient.ARTICHOKES, PizzaIngredient.MUSHROOMS, PizzaIngredient.OLIVES};

    @Override
    public String getName() {
        return "Capricciosa";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
       return ingredients;
    }
}
