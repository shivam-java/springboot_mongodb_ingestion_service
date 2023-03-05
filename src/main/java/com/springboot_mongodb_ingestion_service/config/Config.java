package com.springboot_mongodb_ingestion_service.config;

import org.springframework.beans.factory.annotation.Value;

public class Config {
    @Value("${spring.data.mongodb.collection}")
    private String collectionName;
}
