package com.roytuts.spring.beanpostprocessor.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Employee e = context.getBean(Employee.class);

		System.out.println(e);

		((ConfigurableApplicationContext) context).close();
	}

}
