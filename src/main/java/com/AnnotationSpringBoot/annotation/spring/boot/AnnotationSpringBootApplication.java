package com.AnnotationSpringBoot.annotation.spring.boot;

import com.AnnotationSpringBoot.annotation.spring.boot.Controller.MyController;
import com.AnnotationSpringBoot.annotation.spring.boot.Controller.PizzaController;
import com.AnnotationSpringBoot.annotation.spring.boot.Repository.MyRepository;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.MyService;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.Pizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationSpringBootApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(AnnotationSpringBootApplication.class, args);
		PizzaController pizza = context.getBean(PizzaController.class);
		System.out.println(pizza.getPizza());
		Pizza pizza1 = context.getBean(VegPizza.class);
		System.out.println(pizza1.getPizza());
		var name = context.getBeanDefinitionNames();
		var controller = context.getBean(MyController.class);
		System.out.println(controller.hello());
		var service = context.getBean(MyService.class);
		System.out.println(service.hello());
		var repo = context.getBean(MyRepository.class);
		System.out.println(repo.hello());
	}

}
