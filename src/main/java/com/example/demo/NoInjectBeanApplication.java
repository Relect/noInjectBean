package com.example.demo;

import com.example.demo.config.One;
import com.example.demo.config.Two;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NoInjectBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NoInjectBeanApplication.class, args);

		Two one = context.getBean("two1", Two.class);
		Two two = context.getBean("two2", Two.class);
		System.out.println(one.getOne() == two.getOne());
	}

}
