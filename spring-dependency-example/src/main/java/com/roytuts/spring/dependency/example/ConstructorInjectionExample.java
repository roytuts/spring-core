package com.roytuts.spring.dependency.example;

public class ConstructorInjectionExample {

	private String message;

	/**
	 * Constructor
	 */
	public ConstructorInjectionExample(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
