package com.roytuts.spring.dependency.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterConfig {

	@Bean
	public SetterInjectionExample example() {
		SetterInjectionExample example = new SetterInjectionExample();
		example.setMessage("Annotation based setter injection in Spring");

		return example;
	}

}
