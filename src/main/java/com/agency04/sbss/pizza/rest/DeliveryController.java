package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.PizzaOrder;
import com.agency04.sbss.pizza.service.CustomerService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    ConversionService conversionService;

    @PostMapping(value = "/order", produces = "application/json")
    public ResponseEntity postOrder(@RequestBody DeliveryOrderForm newOrder){
        if(customerService.getCustomer(newOrder.getCustomer()) != null){
            List<PizzaOrder> orders = newOrder.getOrders();
            for(var order : orders)
                pizzaDeliveryService.getPizzaOrders().add(order);
        }
        else
            throw new CustomerNotFoundException("Customer " + newOrder.getCustomer() + " not found.");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<PizzaOrder> getPizzaOrders(){
        return pizzaDeliveryService.getPizzaOrders();
    }
}
