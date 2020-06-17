package com.roytuts.spring.initializingbean.disposablebean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitializingDisposableBean implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Do some initialization stuffs");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Do some clean up stuffs");
	}

}
