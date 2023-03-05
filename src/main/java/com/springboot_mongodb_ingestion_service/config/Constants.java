package com.springboot_mongodb_ingestion_service.config;

public enum Constants {

    DUPLICATE_KEY_NAME_MESSAGE("The Player with this name already exist..OOPS");

    public final String message;
    Constants(String message) {
        this.message=message;
    }
}
