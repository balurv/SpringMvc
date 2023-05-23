package com.example.Fish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class FishApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishApplication.class, args);
	}

}
