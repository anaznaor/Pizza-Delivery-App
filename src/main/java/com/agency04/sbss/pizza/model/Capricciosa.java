package com.agency04.sbss.pizza.model;

public class Capricciosa implements Pizza {
    private String name = "Capricciosa";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.HAM, PizzaIngredient.ARTICHOKES, PizzaIngredient.MUSHROOMS, PizzaIngredient.OLIVES};

    private PizzaSize[] sizes = {PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE};

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
        return "Capricciosa";
    }
}
