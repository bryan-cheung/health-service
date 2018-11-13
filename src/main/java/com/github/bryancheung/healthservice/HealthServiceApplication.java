package com.github.bryancheung.healthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HealthServiceApplication {


	public static void main(String[] args) {

		SpringApplication.run(HealthServiceApplication.class, args);
	}
}
