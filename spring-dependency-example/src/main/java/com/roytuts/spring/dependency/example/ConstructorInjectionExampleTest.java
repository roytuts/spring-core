package com.roytuts.spring.dependency.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionExampleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-constructor.xml");

		ConstructorInjectionExample constructorInjectionExample = context.getBean(ConstructorInjectionExample.class);

		System.out.println(constructorInjectionExample.getMessage());

		((ConfigurableApplicationContext) context).close();
	}

}
