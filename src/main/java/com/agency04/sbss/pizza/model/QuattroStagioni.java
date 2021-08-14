package com.agency04.sbss.pizza.model;

public class QuattroStagioni implements Pizza {
    private String name = "Quattro Stagioni";

    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.MUSHROOMS, PizzaIngredient.OLIVES, PizzaIngredient.OREGANO};

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
        return "QuattroStagioni";
    }
}
