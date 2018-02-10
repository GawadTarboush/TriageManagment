package com.triagemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;




@RestController
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.triagemanagment")
@SpringBootApplication
public class TriageManagmentApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(TriageManagmentApplication.class, args);
		
	}
}
