package com.agency04.sbss.pizza.model;

public class PizzaOrder {
    private String pizza;
    private PizzaSize size;
    private int quantity;

    public PizzaOrder() {
    }

    public PizzaOrder(String pizza, PizzaSize size, int quantity) {
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
