package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.form.CustomerForm;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.CustomerDetails;
import com.agency04.sbss.pizza.model.PizzaIngredient;
import com.agency04.sbss.pizza.service.CustomerService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class PizzaApp implements CommandLineRunner {
    @Autowired
    ApplicationContext context;

    public static void main(String[] args){
       SpringApplication.run(PizzaApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        PizzaDeliveryService deliveryService = context.getBean(PizzaDeliveryService.class);
        deliveryService.saveNewPizza("Margharita", new PizzaIngredient[]{PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.OREGANO});
        deliveryService.saveNewPizza("Capricciosa", new PizzaIngredient[]{PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.OLIVES, PizzaIngredient.HAM, PizzaIngredient.ARTICHOKES, PizzaIngredient.MUSHROOMS});
        deliveryService.saveNewPizza("Quattro Formaggi", new PizzaIngredient[]{PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.GORGONZOLA_CHEESE, PizzaIngredient.ARTICHOKES, PizzaIngredient.OREGANO});
        deliveryService.saveNewPizza("Vegetariana", new PizzaIngredient[]{PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.MOZZARELLA, PizzaIngredient.VARIOUS_VEGETABLES});

        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.newCustomer(new CustomerForm("anaznaor", new CustomerDetails("Ana", "Znaor", "0955700366")));
        customerService.newCustomer(new CustomerForm("petricevicluka", new CustomerDetails("Luka", "Petričević", "0989167600")));
        customerService.newCustomer(new CustomerForm("lucijasrpak", new CustomerDetails("Lucija", "Srpak", "0915786147")));
        customerService.newCustomer(new CustomerForm("smodlakatina", new CustomerDetails("Tina", "Smodlaka", "0996341515")));
        customerService.newCustomer(new CustomerForm("szovko", new CustomerDetails("Sara", "Zovko", "0986543214")));
    }
}
