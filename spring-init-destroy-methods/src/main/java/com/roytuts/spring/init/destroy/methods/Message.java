package com.roytuts.spring.init.destroy.methods;

public class Message {

	private String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void init() {
		System.out.println("Local init() - doing some initialization stuff");
	}

	public void destroy() {
		System.out.println("Local destroy() - doing some clean up stuff");
	}

}
