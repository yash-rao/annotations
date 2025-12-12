package com.AnnotationSpringBoot.annotation.spring.boot.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "hello repo";
    }
}
