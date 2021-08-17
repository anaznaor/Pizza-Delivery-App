package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {
    @Id
    private String userName;

    @OneToOne(mappedBy = "customer")
    @PrimaryKeyJoinColumn
    private CustomerDetails customerDetails;

    @OneToMany(mappedBy = "customer")
    List<Delivery> deliveries;

    public Customer(String userName, String firstName, String lastName, String phone) {
        this.userName = userName;
        this.customerDetails = new CustomerDetails(userName, firstName, lastName, phone);
    }

    public Customer() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return this.getUserName().equals(customer.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, customerDetails, deliveries);
    }
}
