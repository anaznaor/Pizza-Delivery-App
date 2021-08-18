package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer {
    @Id
    @Column(name = "username")
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_details_id")
    private CustomerDetails customerDetails;

    @OneToMany(mappedBy = "customer")
    List<Delivery> deliveries;

    public Customer(String username, CustomerDetails customerDetails) {
        this.username = username;
        this.customerDetails = customerDetails;
    }

    public Customer() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return this.getUsername().equals(customer.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, customerDetails, deliveries);
    }
}
