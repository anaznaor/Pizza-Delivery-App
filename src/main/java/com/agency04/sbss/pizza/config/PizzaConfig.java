package com.agency04.sbss.pizza.config;

import com.agency04.sbss.pizza.rest.StringToEnumConverterFactory;
import com.agency04.sbss.pizza.service.impl.KarijolaPizzeria;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.context.annotation.*;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig implements WebMvcConfigurer {

    @Bean
    @Primary
    public PizzeriaService karijolaPizzeria(){
        return new KarijolaPizzeria();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new StringToEnumConverterFactory());
    }
}
