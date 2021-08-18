package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    private Date submissionDate;
    @OneToMany(mappedBy = "delivery")
    private List<PizzaOrder> pizzaOrders;

    public Delivery() {
    }

    public Delivery(Customer customer, List<PizzaOrder> pizzaOrders) {
        this.customer = customer;
        this.pizzaOrders = pizzaOrders;
        submissionDate = new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return id == delivery.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, submissionDate, pizzaOrders);
    }
}
