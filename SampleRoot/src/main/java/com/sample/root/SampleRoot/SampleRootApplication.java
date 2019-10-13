package com.sample.root.SampleRoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.sample.root.model")
@ComponentScan(basePackages = {"com.sample.root"})
@EnableJpaRepositories("com.sample.root.repo")
public class SampleRootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRootApplication.class, args);
	}

}
