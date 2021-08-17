package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {
    @Autowired
    private PizzeriaService pizzeriaService;

    @GetMapping("/")
    public PizzeriaService getPizzerias(){
        return pizzeriaService;
    }

    @GetMapping("/menu")
    public List<Pizza> getMenu(){
        return pizzeriaService.getMenu();
    }
}
