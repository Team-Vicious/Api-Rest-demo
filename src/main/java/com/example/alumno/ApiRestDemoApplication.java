package com.example.alumno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ApiRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDemoApplication.class, args);
	}

}
