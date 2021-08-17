package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.jpa.DeliveryRepository;
import com.agency04.sbss.pizza.jpa.PizzaOrderRepository;
import com.agency04.sbss.pizza.jpa.PizzaRepository;
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
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;
    @Autowired
    private PizzaRepository pizzaRepository;
    @Autowired
    private CustomerService customerService;

    @PostConstruct
    public void doMyPostConstruct(){
        System.out.println("Inside of PizzaDelivery's doMyPostConstruct.");
        available = true;
    }

    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    @PreDestroy
    public void doMyPreDestroy(){
        System.out.println("Inside of PizzaDelivery's doMyPreDestroy");
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrderRepository.findAll();
    }

    public boolean saveNewDelivery(DeliveryOrderForm deliveryOrderForm){
        Customer customer = customerService.getCustomer(deliveryOrderForm.getCustomer());
        Delivery delivery = new Delivery(customer, deliveryOrderForm.getOrders());
        deliveryRepository.save(delivery);
        return saveNewPizzaOrders(deliveryOrderForm.getOrders());
    }

    public boolean saveNewPizzaOrders(List<PizzaOrder> pizzaOrders){
        for(var order : pizzaOrders){
            Pizza pizza = getPizza(order.getPizzaName());
            if(pizza != null) {
                order.setPizza(pizza);
                pizzaOrderRepository.save(order);
                return true;
            }
        }
        return false;
    }

    public Pizza getPizza(String pizzaName){
        Optional<Pizza> result = pizzaRepository.findById(pizzaName);
        Pizza pizza = null;
        if (result.isPresent()) {
            pizza = result.get();
        }
        return pizza;
    }

    public void saveNewPizza(String name, PizzaIngredient[] pizzaIngredients){
        Pizza pizza = new Pizza(name, pizzaIngredients);
        pizzaRepository.save(pizza);
    }
}