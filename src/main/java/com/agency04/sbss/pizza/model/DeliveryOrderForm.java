package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderForm {
    private String customer;
    private List<PizzaOrder> orders = new ArrayList<>();

    public DeliveryOrderForm() {
    }

    public DeliveryOrderForm(String customer, PizzaOrder... order) {
        this.customer = customer;
        for(var o: order)
            this.orders.add(o);
    }

    public DeliveryOrderForm(String customer, List<PizzaOrder> order) {
        this.customer = customer;
        this.orders = order;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<PizzaOrder> getOrders() {
        return this.orders;
    }

    public void setOrders(PizzaOrder... order){
        for(var o: order){
            orders.add(o);
        }
    }
}
