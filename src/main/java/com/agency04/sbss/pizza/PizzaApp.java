package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");

        PizzaDeliveryService delivery = ctx.getBean("pizzaDeliveryService", PizzaDeliveryService.class);

        delivery.orderPizza(new Margherita());
        System.out.println(delivery.getKarijolaPizzeria().makePizza(new Margherita()));

        delivery.orderPizza(new QuattroFormaggi());
        System.out.println(delivery.getMaslinaPizzeria().makePizza(new QuattroFormaggi()));

        ctx.close();
    }

}
