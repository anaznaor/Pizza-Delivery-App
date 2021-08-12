package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    ConversionService conversionService;

    @GetMapping("/customer/{userName}")
    public Customer getCustomer(@PathVariable String userName){
        Customer customer = customerService.getCustomer(userName);
        if(customer == null)
            throw new CustomerNotFoundException("Customer with username " + userName + " not found.");
        return customer;
    }

    @PostMapping(value = "/customer", produces = "application/json")
    public ResponseEntity postCustomer(@RequestBody Customer newCustomer) throws Exception {
        boolean success = customerService.newCustomer(newCustomer);
        if(!success)
            throw new Exception("Username is already taken!");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping(value = "/customer", produces = "application/json")
    public ResponseEntity putCustomer(@RequestBody Customer customer) throws Exception {
        boolean success = customerService.updateCustomer(customer);
        if(!success)
            throw new Exception("Cannot change username!");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping(value = "/customer/{userName}")
    public ResponseEntity deleteCustomer(@PathVariable String userName){
        boolean success = customerService.deleteCustomer(userName);
        if(!success)
            throw new CustomerNotFoundException("Customer with username " + userName + " not found.");
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
