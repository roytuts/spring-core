package com.roytuts.spring.dependency.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationSetterInjectionExampleTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SetterConfig.class);

		SetterInjectionExample setterInjectionExample = context.getBean(SetterInjectionExample.class);

		System.out.println(setterInjectionExample.getMessage());

		((ConfigurableApplicationContext) context).close();
	}

}
