package com.agency04.sbss.pizza.form;

import com.agency04.sbss.pizza.model.CustomerDetails;

public class CustomerForm {
    private String username;
    private CustomerDetails customerDetails;

    public CustomerForm() {
    }

    public CustomerForm(String username, CustomerDetails customerDetails) {
        this.username = username;
        this.customerDetails = customerDetails;
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
}
