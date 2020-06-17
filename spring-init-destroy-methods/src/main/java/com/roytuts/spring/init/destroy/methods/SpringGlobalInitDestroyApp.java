package com.roytuts.spring.init.destroy.methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringGlobalInitDestroyApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigGlobal.class);

		InitDestroyBean idb = context.getBean(InitDestroyBean.class);

		System.out.println(idb.getMsg());

		AnotherInitDestroyBean aidb = context.getBean(AnotherInitDestroyBean.class);

		System.out.println(aidb.getMsg());

		((ConfigurableApplicationContext) context).close();
	}

}
