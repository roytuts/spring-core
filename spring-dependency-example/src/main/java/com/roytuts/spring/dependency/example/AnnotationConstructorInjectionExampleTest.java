package com.roytuts.spring.dependency.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConstructorInjectionExampleTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConstructorConfig.class);

		ConstructorInjectionExample constructorInjectionExample = context.getBean(ConstructorInjectionExample.class);

		System.out.println(constructorInjectionExample.getMessage());

		((ConfigurableApplicationContext) context).close();
	}

}
