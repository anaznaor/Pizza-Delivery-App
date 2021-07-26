package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");

        PizzaDeliveryService delivery = ctx.getBean("pizzaDeliveryService", PizzaDeliveryService.class);

        delivery.orderPizza(new Pizza[]{new Margherita(), new Vegetariana(), new Capricciosa()});

        ctx.close();
    }

}
