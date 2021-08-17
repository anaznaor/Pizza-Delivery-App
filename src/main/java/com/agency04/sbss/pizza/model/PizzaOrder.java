package com.agency04.sbss.pizza.model;

import javax.persistence.*;

@Entity
public class PizzaOrder {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
    private String pizzaName;
    private PizzaSize size;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public PizzaOrder() {
    }

    public PizzaOrder(String pizzaName, PizzaSize size, int quantity) {
        this.pizzaName = pizzaName;
        this.size = size;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
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
