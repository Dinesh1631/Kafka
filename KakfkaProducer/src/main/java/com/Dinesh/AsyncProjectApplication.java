package com.Dinesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Kafka")

public class AsyncProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncProjectApplication.class, args);
	}

}
