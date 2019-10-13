package com.micro.service.MicroService4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.micro.service.MicroService4.model")
@ComponentScan(basePackages = {"com.micro.service.MicroService4"})
@EnableJpaRepositories("com.micro.service.MicroService4.repo")
public class MicroService4Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService4Application.class, args);
	}

}
