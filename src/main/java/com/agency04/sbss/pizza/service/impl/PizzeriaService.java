package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;

public interface PizzeriaService {
    public String getName();

    public String getAddress();

    public String makePizza(Pizza pizza);
}
