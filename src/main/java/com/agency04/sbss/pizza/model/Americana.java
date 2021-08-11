package com.agency04.sbss.pizza.model;

public class Americana implements Pizza {
    private String name = "Americana";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.SAUSAGE, PizzaIngredient.FRENCH_FRIES};

    private PizzaSize[] sizes = {PizzaSize.SMALL, PizzaSize.LARGE};

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
        return "Americana";
    }
}
