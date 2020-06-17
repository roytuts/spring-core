package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLocalInitDestroyApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLocal.class);

		Message msg = context.getBean(Message.class);

		System.out.println(msg.getMsg());

		((ConfigurableApplicationContext) context).close();
	}

}
