package com.dio.heroisdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroisdioApplication {

	public static void main(String[] args) {

		SpringApplication.run(HeroisdioApplication.class, args);
		System.out.println("Eu gosto mais de webflux q de heróis");
	}

}
