package com.triagemenegment.config.triageconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TriageConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriageConfigServerApplication.class, args);
	}
}
