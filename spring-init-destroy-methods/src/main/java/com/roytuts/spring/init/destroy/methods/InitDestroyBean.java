package com.roytuts.spring.init.destroy.methods;

public class InitDestroyBean {

	private String msg;

	public InitDestroyBean(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void init() {
		System.out.println("Global init() - InitDestroyBean - doing some initialization stuff");
	}

	public void destroy() {
		System.out.println("Global destroy() - InitDestroyBean - doing some clean up stuff");
	}

}
