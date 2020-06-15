package com.roytuts.spring.beanpostprocessor.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public EmployeeBeanPostProcessor employeeBeanPostProcessor() {
		return new EmployeeBeanPostProcessor();
	}

	@Bean
	public Employee employee() {
		return new Employee(12345, "Asish");
	}

}
