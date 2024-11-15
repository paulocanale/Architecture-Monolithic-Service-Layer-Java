# Architecture-Monolithic-Service-Layer-Java

This repository demonstrates a monolithic architecture using a **Service Layer** in **Java** with **Spring Framework**. It showcases the development of a simple REST API for managing `items`, integrating a MongoDB database.

## Features

- **Layered Architecture**:
  - **Controller Layer**: Handles HTTP requests and responses.
  - **Service Layer**: Contains business logic.
  - **Repository Layer**: Manages database operations.

- **RESTful API**:
  - Create, retrieve, update, and delete (CRUD) operations for `items`.
  - Integration with MongoDB as the database.

- **Dockerized Environment**:
  - Uses Docker and Docker Compose for easy deployment.

## Technologies Used

- **Java** (17 or later)
- **Spring Boot** (latest version)
- **MongoDB** (as NoSQL database)
- **Docker** and **Docker Compose**

## Prerequisites

- **Java** (17 or later)
- **Docker** and **Docker Compose**

## Steps to Run

1. **Option A: Build the Project**
   Execute the following command to package the application:
   ```bash
   ./mvnw clean package
   ```
   **Option B: Using public Docker image**
   You can directly use the public image available at: https://hub.docker.com/r/paulocanale/architecture-monolithic-service-layer-java

2. **Option A: Start using Docker Compose locally**
   ```bash
   docker-compose up --build
   ```
   **Option B: Run using the remote Docker image**
   ```bash
   docker run -p 8080:8080 paulocanale/architecture-monolithic-service-layer-java:latest
   ```

3. **Access the Application**
    - REST API available at: http://localhost:8080

4. **Sample API Requests**
    Create an item
    - curl -X POST -H "Content-Type: application/json" -d '{"name": "Example", "description": "This is an example item"}' http://localhost:8080/items

    Get all items
    - curl http://localhost:8080/items

    Get an item by ID
    - curl http://localhost:8080/items/{id}

    Delete an item by ID
    - curl -X DELETE http://localhost:8080/items/{id}