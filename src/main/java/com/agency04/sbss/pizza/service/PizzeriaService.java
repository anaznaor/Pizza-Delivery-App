package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;

import java.util.List;

public interface PizzeriaService {
    public String getName();

    public String getAddress();

    public String makePizza(Pizza pizza);

    public List<Pizza> getMenu();
}
