package com.paulocanale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Architecture-Monolithic-Service-Layer-Java application.
 * 
 * This class initializes and launches the Spring Boot application. It serves as the
 * starting point for the application, configuring and bootstrapping all components.
 * 
 * Author: Paulo Canale <paulocanale@me.com>
 */
@SpringBootApplication
public class Application {

    /**
     * The main method that launches the application.
     * 
     * @param args command-line arguments (if any)
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
