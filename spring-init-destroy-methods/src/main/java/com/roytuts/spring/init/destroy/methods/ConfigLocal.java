package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigLocal {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Message message() {
		return new Message("Welcome to local init() and destroy()");
	}

}
