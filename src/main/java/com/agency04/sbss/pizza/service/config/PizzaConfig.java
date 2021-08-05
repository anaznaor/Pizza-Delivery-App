package com.agency04.sbss.pizza.service.config;

import com.agency04.sbss.pizza.service.impl.KarijolaPizzeria;
import com.agency04.sbss.pizza.service.impl.PizzeriaService;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean
    @Primary
    public PizzeriaService karijolaPizzeria(){
        return new KarijolaPizzeria();
    }
}
