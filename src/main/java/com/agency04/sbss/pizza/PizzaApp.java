package com.agency04.sbss.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService delivery = ctx.getBean("pizzaDeliveryService", PizzaDeliveryService.class);

        delivery.orderPizza(new QuattroFormaggi());
        System.out.println(delivery.getKarijolaPizzeria().makePizza(new QuattroFormaggi()));

        ctx.close();
    }

}
