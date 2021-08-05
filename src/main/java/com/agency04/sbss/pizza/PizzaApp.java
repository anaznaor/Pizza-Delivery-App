package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.QuattroFormaggi;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(PizzaApp.class, args);
       PizzaDeliveryService delivery = context.getBean(PizzaDeliveryService.class);
       delivery.orderPizza(new QuattroFormaggi());
    }

}
