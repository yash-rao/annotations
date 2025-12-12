package com.AnnotationSpringBoot.annotation.spring.boot.config;

import com.AnnotationSpringBoot.annotation.spring.boot.Controller.PizzaController;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.NonVegPizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.Pizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }


}
