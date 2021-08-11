package com.agency04.sbss.pizza.model;

public class Tonno implements Pizza {
    private String name = "Tonno";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.TUNA, PizzaIngredient.ONIONS};

    private PizzaSize[] sizes = {PizzaSize.LARGE};

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
        return "Tonno";
    }
}
