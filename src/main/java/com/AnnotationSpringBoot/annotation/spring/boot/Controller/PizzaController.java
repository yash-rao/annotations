package com.AnnotationSpringBoot.annotation.spring.boot.Controller;

import com.AnnotationSpringBoot.annotation.spring.boot.Service.NonVegPizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.Pizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class PizzaController {

    private Pizza pizza;

    //public PizzaController(@Qualifier("beanName") Pizza pizza) {
//    @Autowired
    public PizzaController( Pizza pizza) {
        this.pizza = pizza;
    }

    public void init(){
        System.out.println("initialization starts");
    }

    public void destroy(){
        System.out.println("Destruction logic");
    }

    public String getPizza(){
        return pizza.getPizza();
    }
}
