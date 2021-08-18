package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;

    public CustomerDetails() {
    }

    public CustomerDetails(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long username) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phone);
    }
}
