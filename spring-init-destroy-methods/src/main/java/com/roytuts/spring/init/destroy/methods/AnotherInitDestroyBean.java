package com.roytuts.spring.init.destroy.methods;

public class AnotherInitDestroyBean {

	private String msg;

	public AnotherInitDestroyBean(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void init() {
		System.out.println("Global init() - AnotherInitDestroyBean - doing some initialization stuff");
	}

	public void destroy() {
		System.out.println("Global destroy() - AnotherInitDestroyBean - doing some clean up stuff");
	}

}
