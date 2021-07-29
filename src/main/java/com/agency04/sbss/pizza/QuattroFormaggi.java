package com.agency04.sbss.pizza;

public class QuattroFormaggi implements Pizza {
    private PizzaIngredient[] ingredients =
            {PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA,
                    PizzaIngredient.GORGONZOLA_CHEESE, PizzaIngredient.ARTICHOKES, PizzaIngredient.OREGANO};

    @Override
    public String getName() {
        return "Quattro Formaggi";
    }

    @Override
    public PizzaIngredient[] getIngredients() {
        return ingredients;
    }
}
