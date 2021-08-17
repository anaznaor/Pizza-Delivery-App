package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CustomerDetails {
    @Id
    @Column(name = "customer_userName")
    private String userName;
    private String firstName;
    private String lastName;
    private String phone;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "customer_userName")
    private Customer customer;

    public CustomerDetails() {
    }

    public CustomerDetails(String userName, String firstName, String lastName, String phone) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return this.getUserName().equals(customer.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, firstName, lastName, phone, customer);
    }
}
