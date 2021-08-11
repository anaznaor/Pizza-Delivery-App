package com.agency04.sbss.pizza.model;

public class FruttiDiMare implements Pizza {
    private String name = "Frutti di Mare";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.SEAFOOD};

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
    public String toString(){
        return "Frutti di Mare";
    }
}
