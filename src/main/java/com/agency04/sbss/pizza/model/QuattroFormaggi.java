package com.agency04.sbss.pizza.model;

public class QuattroFormaggi implements Pizza {
    private String name = "Quattro Formaggi";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.GORGONZOLA_CHEESE, PizzaIngredient.ARTICHOKES, PizzaIngredient.OREGANO};

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
        return "QuattroFormaggi";
    }
}
