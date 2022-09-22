package com.optum.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	
	}
	@RequestMapping("/")
	String sayHello() {
		System.out.println("Hello mysql logs test===>");
		System.out.println("welcome to webapp+mysql");

		return "Hello  azure cloud World logs !!!!!!!";

}
