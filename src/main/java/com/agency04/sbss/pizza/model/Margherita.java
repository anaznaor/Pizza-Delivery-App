package com.agency04.sbss.pizza.model;

import java.util.Arrays;

public class Margherita implements Pizza {
    private String name = "Margherita";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.OREGANO};

    private PizzaSize[] sizes = {PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE};

    public String getName() {
        return "Margherita";
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
        return "Margherita";
    }
}
