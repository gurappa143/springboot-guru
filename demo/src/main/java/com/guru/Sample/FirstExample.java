package com.guru.Sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstExample {

	@RequestMapping("/")
	public String message() {
		return "Welcome to Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstExample.class, args);

	}

}
