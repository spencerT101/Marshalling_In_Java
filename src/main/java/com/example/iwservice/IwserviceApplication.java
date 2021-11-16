package com.example.iwservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class IwserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IwserviceApplication.class, args);
	}

}
