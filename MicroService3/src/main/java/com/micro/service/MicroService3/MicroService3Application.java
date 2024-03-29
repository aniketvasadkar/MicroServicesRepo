package com.micro.service.MicroService3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.micro.service.MicroService3.model")
@ComponentScan(basePackages = {"com.micro.service.MicroService3"})
@EnableJpaRepositories("com.micro.service.MicroService3.repo")
public class MicroService3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService3Application.class, args);
	}

}
