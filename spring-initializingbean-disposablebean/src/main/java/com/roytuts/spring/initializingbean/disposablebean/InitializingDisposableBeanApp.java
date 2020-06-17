package com.roytuts.spring.initializingbean.disposablebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitializingDisposableBeanApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		InitializingDisposableBean idb = context.getBean(InitializingDisposableBean.class);

		System.out.println(idb);

		((ConfigurableApplicationContext) context).close();
	}

}
