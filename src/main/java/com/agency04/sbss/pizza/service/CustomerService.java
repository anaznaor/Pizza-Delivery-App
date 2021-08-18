package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void doMyPostConstruct() {
        System.out.println("Inside of CustomerService's doMyPostConstruct.");
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(String userName){
        Optional<Customer> result = customerRepository.findById(userName);
        Customer customer = null;
        if (result.isPresent()) {
            customer = result.get();
        }
        return customer;
    }

    public boolean newCustomer(Customer newCustomer){
        if(customerRepository.findById(newCustomer.getUsername()).isPresent())
            return false;
        customerRepository.save(newCustomer);
        return true;
    }

    public boolean updateCustomer(Customer customer){
        Customer theCustomer = getCustomer(customer.getUsername());
        if(theCustomer != null){
            theCustomer.getCustomerDetails().setFirstName(customer.getCustomerDetails().getFirstName());
            theCustomer.getCustomerDetails().setLastName(customer.getCustomerDetails().getLastName());
            theCustomer.getCustomerDetails().setPhone(customer.getCustomerDetails().getPhone());
            return true;
        }
        else
            return false;
    }

    public boolean deleteCustomer(String userName){
        Customer theCustomer = getCustomer(userName);
        if(theCustomer != null){
            customerRepository.deleteById(userName);
            return true;
        }
        else
            return false;
    }
}
