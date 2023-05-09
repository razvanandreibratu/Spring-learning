package com.example.practice;

import com.example.practice.controllers.MyController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
