package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGlobalInitDestroyXmlApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-init-destroy-global.xml");

		InitDestroyBean idb = context.getBean(InitDestroyBean.class);

		System.out.println(idb.getMsg());

		AnotherInitDestroyBean aidb = context.getBean(AnotherInitDestroyBean.class);

		System.out.println(aidb.getMsg());

		((ConfigurableApplicationContext) context).close();
	}

}
