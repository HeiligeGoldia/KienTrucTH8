package com.se.th8_client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.se.th8_client1.controller.GreetingController;

@SpringBootApplication
@RestController
public class Th8Client1Application implements GreetingController {

	public static void main(String[] args) {
		SpringApplication.run(Th8Client1Application.class, args);
	}
	
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

	@Override
	public String greeting() {
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}

}
