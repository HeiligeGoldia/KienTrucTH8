package com.se.th8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Th8Application {

	public static void main(String[] args) {
		SpringApplication.run(Th8Application.class, args);
	}

}
