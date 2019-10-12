package com.sample.root.SampleRoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sample.root")
public class SampleRootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRootApplication.class, args);
	}

}
