package com.AnnotationSpringBoot.annotation.spring.boot.Service;

import org.springframework.context.annotation.Primary;


public class VegPizza implements Pizza {
    @Override
    public String getPizza(){
        return "VegPizza";
    }
}
