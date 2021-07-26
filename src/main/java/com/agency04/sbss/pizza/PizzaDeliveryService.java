package com.agency04.sbss.pizza;

public class PizzaDeliveryService {
    private PizzeriaService pizzeriaService1;
    private PizzeriaService pizzeriaService2;

    public PizzaDeliveryService(PizzeriaService pizzeriaService) {
		this.pizzeriaService1 = pizzeriaService;
	}

    public void orderPizza(Pizza... pizzas) {
        int  i = 1;
        StringBuilder sb = new StringBuilder();
        System.out.println("Order:");
        for(var pizza : pizzas) {
            System.out.println("1 " + pizza.getName());
            if(i > 0)
                System.out.println(pizzeriaService1.makePizza(pizza));
            else
                System.out.println(pizzeriaService2.makePizza(pizza));
            i *= -1;
        }
    }

    public void setPizzeriaService2(PizzeriaService pizzeriaService) {
        this.pizzeriaService2 = pizzeriaService;
    }
}
