package com.roytuts.spring.dependency.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorConfig {

	@Bean
	public ConstructorInjectionExample example() {
		return new ConstructorInjectionExample("Annotation based constructor injection in Spring");
	}

}
