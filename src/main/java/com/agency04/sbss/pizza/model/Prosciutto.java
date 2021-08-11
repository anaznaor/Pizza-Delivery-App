package com.agency04.sbss.pizza.model;

public class Prosciutto implements Pizza {
    private String name = "Prosciutto";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.HAM, PizzaIngredient.OREGANO};

    private PizzaSize[] sizes = {PizzaSize.SMALL};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }

    @Override
    public PizzaSize[] getSizes() {
        return sizes;
    }

    @Override
    public String toString() {
        return "Prosciutto";
    }
}
