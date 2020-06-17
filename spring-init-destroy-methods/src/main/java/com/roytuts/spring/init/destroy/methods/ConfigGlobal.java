package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigGlobal {

	@DefaultInitDestroy
	public InitDestroyBean initDestroyBean() {
		return new InitDestroyBean("Welcome to global init() and destroy()");
	}

	@DefaultInitDestroy
	public AnotherInitDestroyBean anotherInitDestroyBean() {
		return new AnotherInitDestroyBean("Welcome to another global init() and destroy()");
	}

}
