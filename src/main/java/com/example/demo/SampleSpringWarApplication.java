package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cfr.controller"})
public class SampleSpringWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringWarApplication.class, args);
	}
}
