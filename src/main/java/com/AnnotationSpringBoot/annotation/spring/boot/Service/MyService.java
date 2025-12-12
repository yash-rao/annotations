package com.AnnotationSpringBoot.annotation.spring.boot.Service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello(){
        return "Hello Service";
    }
}
