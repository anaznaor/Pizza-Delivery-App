package com.agency04.sbss.pizza.form;

import com.agency04.sbss.pizza.model.PizzaOrder;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderForm {
    private String customer;
    private List<PizzaOrder> orders = new ArrayList<>();

    public DeliveryOrderForm() {
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
