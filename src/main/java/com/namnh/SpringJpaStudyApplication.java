package com.namnh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringJpaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaStudyApplication.class, args);
	}
}
