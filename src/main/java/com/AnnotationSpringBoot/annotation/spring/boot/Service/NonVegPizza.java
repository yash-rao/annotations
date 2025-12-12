package com.AnnotationSpringBoot.annotation.spring.boot.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//
//@Component
//@Primary
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non Veg pizza";
    }
}
