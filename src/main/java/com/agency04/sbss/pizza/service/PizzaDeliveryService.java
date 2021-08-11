package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Service
public class PizzaDeliveryService {
    @Autowired
    private PizzeriaService pizzeriaService;
    private boolean available;
    private List<Customer> customers;
    private List<DeliveryOrderForm> orders = new LinkedList<>();

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of PizzaDelivery's doMyPostConstruct.");
        available = true;

        customers = new ArrayList<>();
        customers.add(new Customer("anaznaor", "Ana", "Znaor", 26, "Croatia", "Split", "Terzićeva 5"));
        customers.add(new Customer("petricevicluka", "Luka", "Petričević", 25, "Croatia", "Split", "Antofagaste 2"));
        customers.add(new Customer("lucijasrpak", "Lucija", "Srpak", 23, "Croatia", "Split", "Domovinskog rata 27"));
        customers.add(new Customer("smodlakatina", "Tina", "Smodlaka", 22, "Croatia", "Solin", "Matoševa 6"));
        customers.add(new Customer("szovko", "Sara", "Zovko", 25, "Croatia", "Zagreb", "Travanjska 12"));

        DeliveryOrderForm firstDeliveryOrder = new DeliveryOrderForm();
        firstDeliveryOrder.setCustomer(customers.get(2).getUserName());
        firstDeliveryOrder.setOrders(new PizzaOrder("Margharita", PizzaSize.SMALL, 2));
        firstDeliveryOrder.setOrders(new PizzaOrder("Capriciosa", PizzaSize.LARGE, 1),
                new PizzaOrder("Vegetariana", PizzaSize.MEDIUM, 3));
        orders.add(firstDeliveryOrder);
    }
    public void orderPizza(Pizza pizza) {
        System.out.println("Order: " + pizza.getName() + " in pizzeria " + pizzeriaService.getName());
    }

    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of PizzaDelivery's doMyPreDestroy");
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<DeliveryOrderForm> getOrders() {
        return orders;
    }
}