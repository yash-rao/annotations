package com.AnnotationSpringBoot.annotation.spring.boot.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        return "hello Controller";
    }
}
