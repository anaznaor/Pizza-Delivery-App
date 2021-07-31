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

        PizzaDeliveryService deliveryTest = ctx.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println("Is the new delivery service the same as the old one? " + (delivery == deliveryTest));

        PizzeriaService maslina1 = delivery.getMaslinaPizzeria();
        PizzeriaService maslina2 = deliveryTest.getMaslinaPizzeria();
        System.out.println("Are the two MaslinaPizzerias pointing on the same object: " + (maslina1 == maslina2));
        System.out.println("Maslina1's memory location: " + maslina1);
        System.out.println("Maslina2's memory location: " + maslina2);

        PizzeriaService karijola1 = delivery.getKarijolaPizzeria();
        PizzeriaService karijola2 = deliveryTest.getKarijolaPizzeria();
        System.out.println("Are the two KarijolaPizzerias pointing on the same object: " + (karijola1 == karijola2));
        System.out.println("Karijola1's memory location: " + karijola1);
        System.out.println("Karijola2's memory location: " + karijola2);

        ctx.close();
    }

}
