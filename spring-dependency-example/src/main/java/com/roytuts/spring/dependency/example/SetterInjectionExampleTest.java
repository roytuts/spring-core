package com.roytuts.spring.dependency.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionExampleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-setter.xml");

		SetterInjectionExample setterInjectionExample = context.getBean(SetterInjectionExample.class);

		System.out.println(setterInjectionExample.getMessage());

		((ConfigurableApplicationContext) context).close();
	}

}
