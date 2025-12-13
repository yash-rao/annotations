package com.AnnotationSpringBoot.annotation.spring.boot;

import com.AnnotationSpringBoot.annotation.spring.boot.Controller.MyController;
import com.AnnotationSpringBoot.annotation.spring.boot.Controller.PizzaController;
import com.AnnotationSpringBoot.annotation.spring.boot.Lazy.LazyLoader;
import com.AnnotationSpringBoot.annotation.spring.boot.Repository.MyRepository;
import com.AnnotationSpringBoot.annotation.spring.boot.Scope.PrototypeBean;
import com.AnnotationSpringBoot.annotation.spring.boot.Scope.Singleton;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.MyService;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.Pizza;
import com.AnnotationSpringBoot.annotation.spring.boot.Service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationSpringBootApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(AnnotationSpringBootApplication.class, args);
//		PizzaController pizza = context.getBean(PizzaController.class);
//		System.out.println(pizza.getPizza());
//		Pizza pizza1 = context.getBean(VegPizza.class);
//		System.out.println(pizza1.getPizza());
//		var name = context.getBeanDefinitionNames();
//		var controller = context.getBean(MyController.class);
//		System.out.println(controller.hello());
//		var service = context.getBean(MyService.class);
//		System.out.println(service.hello());
//		var repo = context.getBean(MyRepository.class);
//		System.out.println(repo.hello());
//
//		LazyLoader lazy = context.getBean(LazyLoader.class);

		Singleton singleton = context.getBean(Singleton.class);
		Singleton singleton1 = context.getBean(Singleton.class);
		Singleton singleton2 = context.getBean(Singleton.class);
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);

		System.out.println(prototypeBean.hashCode());
		System.out.println(prototypeBean1.hashCode());
		System.out.println(prototypeBean2.hashCode());

	}

}
