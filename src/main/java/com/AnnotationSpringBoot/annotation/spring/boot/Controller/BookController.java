package com.AnnotationSpringBoot.annotation.spring.boot.Controller;

import com.AnnotationSpringBoot.annotation.spring.boot.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Worllddd";
    }

    @RequestMapping("/book")
    @ResponseBody
    public Book getBook() {
        Book book =  new Book(1,"Core Java","Core java and advance java");
        return book;
    }
}
