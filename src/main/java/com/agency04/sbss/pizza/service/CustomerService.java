package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    @PostConstruct
    public void doMyPostConstruct() {
        System.out.println("Inside of CustomerService's doMyPostConstruct.");

        customers.add(new Customer("anaznaor", "Ana", "Znaor", 26, "Croatia", "Split", "Terzićeva 5"));
        customers.add(new Customer("petricevicluka", "Luka", "Petričević", 25, "Croatia", "Split", "Antofagaste 2"));
        customers.add(new Customer("lucijasrpak", "Lucija", "Srpak", 23, "Croatia", "Split", "Domovinskog rata 27"));
        customers.add(new Customer("smodlakatina", "Tina", "Smodlaka", 22, "Croatia", "Solin", "Matoševa 6"));
        customers.add(new Customer("szovko", "Sara", "Zovko", 25, "Croatia", "Zagreb", "Travanjska 12"));
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String userName){
        Customer customer = null;
        for(Customer c : this.customers) {
            if(c.getUserName().equals(userName))
                customer = c;
        }
        return customer;
    }

    public boolean newCustomer(Customer newCustomer){
        if(this.customers.contains(newCustomer))
            return false;
        this.customers.add(newCustomer);
        return true;
    }

    public boolean updateCustomer(Customer customer){
        if(this.customers.contains(customer)){
            for(Customer c : this.customers) {
                if (c.equals(customer)){
                    c.setName(customer.getName());
                    c.setLastName(customer.getLastName());
                    c.setAge(customer.getAge());
                    c.setCountry(customer.getCountry());
                    c.setCity(customer.getCity());
                    c.setAddress(customer.getAddress());
                    break;
                }
            }
            return true;
        }
        else
            return false;
    }

    public boolean deleteCustomer(String userName){
        Iterator<Customer> it = this.customers.iterator();
        while(it.hasNext()) {
            if(it.next().getUserName().equals(userName)){
                it.remove();
                return true;
            }
        }
        return false;
    }
}
