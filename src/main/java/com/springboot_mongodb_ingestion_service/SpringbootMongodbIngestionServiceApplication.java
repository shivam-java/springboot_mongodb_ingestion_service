package com.springboot_mongodb_ingestion_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbootMongodbIngestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbIngestionServiceApplication.class, args);
	}

}
