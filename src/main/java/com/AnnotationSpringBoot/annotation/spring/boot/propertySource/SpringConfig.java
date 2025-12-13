package com.AnnotationSpringBoot.annotation.spring.boot.propertySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:main.properties")
//@PropertySource("classpath:messages.properties")
@PropertySources({
        @PropertySource("classpath:main.properties"),
        @PropertySource("classpath:messages.properties")
})
public class SpringConfig {

}
