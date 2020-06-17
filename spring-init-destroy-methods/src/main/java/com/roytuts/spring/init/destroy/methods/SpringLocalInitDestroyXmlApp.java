package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLocalInitDestroyXmlApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-init-destroy-local.xml");

		Message msg = context.getBean(Message.class);

		System.out.println(msg.getMsg());

		((ConfigurableApplicationContext) context).close();
	}

}
