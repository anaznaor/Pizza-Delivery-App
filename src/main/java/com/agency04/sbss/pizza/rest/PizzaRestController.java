package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaRestController {
    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;
    @Autowired
    ConversionService conversionService;

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to PizzaApp!";
    }

    @GetMapping("/pizzeria")
    public PizzeriaService getPizzerias(){
        return pizzaDeliveryService.getPizzeriaService();
    }

    @GetMapping("/pizzeria/menu")
    public List<Pizza> getMenu(){
        PizzeriaService pizzeria = pizzaDeliveryService.getPizzeriaService();
        return pizzeria.getMenu();
    }

    @GetMapping("/customer/{userName}")
    public Customer getCustomer(@PathVariable String userName){
        Customer theOne = null;
        for(Customer c : pizzaDeliveryService.getCustomers()) {
            if(c.getUserName().equals(userName))
               theOne = c;
        }
        if(theOne == null)
            throw new CustomerNotFoundException("Customer with username " + userName + " not found.");
        return theOne;
    }

    @PostMapping(value = "/customer", produces = "application/json")
    public ResponseEntity postCustomer(@RequestBody Customer newCustomer) throws Exception {
        if(pizzaDeliveryService.getCustomers().contains(newCustomer))
            throw new Exception("Username is already taken!");
        pizzaDeliveryService.getCustomers().add(newCustomer);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping(value = "/customer", produces = "application/json")
    public ResponseEntity putCustomer(@RequestBody Customer newCustomer) throws Exception {
        if(pizzaDeliveryService.getCustomers().contains(newCustomer)){
            for(Customer c : pizzaDeliveryService.getCustomers()) {
                if (c.equals(newCustomer)){
                    c.setName(newCustomer.getName());
                    c.setLastName(newCustomer.getLastName());
                    c.setAge(newCustomer.getAge());
                    c.setCountry(newCustomer.getCountry());
                    c.setCity(newCustomer.getCity());
                    c.setAddress(newCustomer.getAddress());
                    break;
                }
            }
            return ResponseEntity.ok(HttpStatus.OK);
        }
        else
         throw new Exception("Cannot change username!");
    }

    @DeleteMapping(value = "/customer/{userName}")
    public ResponseEntity deleteCustomer(@PathVariable String userName){
        Customer theOne = null;
        boolean success = false;
        Iterator<Customer> it = pizzaDeliveryService.getCustomers().iterator();
        while(it.hasNext()) {
            if(it.next().getUserName().equals(userName)){
                it.remove();
                success = true;
                break;
            }
        }
        if(!success)
            throw new CustomerNotFoundException("Customer with username " + userName + " not found.");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping(value = "/delivery/order", produces = "application/json")
    public ResponseEntity postOrder(@RequestBody DeliveryOrderForm newOrder){
        pizzaDeliveryService.getOrders().add(newOrder);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/delivery/list")
    public List<DeliveryOrderForm> getOrders(){
        return pizzaDeliveryService.getOrders();
    }
}
