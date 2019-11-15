package com.micro.service.MicroService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.micro.service.MicroService2.model")
@ComponentScan(basePackages = {"com.micro.service.MicroService2"})
@EnableJpaRepositories("com.micro.service.MicroService2.repo")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MicroService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService2Application.class, args);
	}

}
