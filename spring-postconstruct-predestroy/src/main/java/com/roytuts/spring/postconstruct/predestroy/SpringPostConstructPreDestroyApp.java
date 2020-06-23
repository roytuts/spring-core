package com.roytuts.spring.postconstruct.predestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.spring.postconstruct.predestroy.service.FlagService;

@SpringBootApplication
public class SpringPostConstructPreDestroyApp implements CommandLineRunner {
	
	@Autowired
	private FlagService flagService;

	public static void main(String[] args) {
		SpringApplication.run(SpringPostConstructPreDestroyApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		flagService.doFlagWork();
		System.out.println("DB Flag in System Property: " + System.getProperty("dbFlag"));
	}
	
}
