
# Spring Boot User Management Demo

## Overview

This project demonstrates the implementation of a Spring Boot web application following the MVC layered architecture. It showcases core Spring Boot features such as dependency injection, annotations, and service-repository separation, using an in-memory data store to manage user information.

## Project Objectives

- Implement a layered architecture including Model, Repository, and Service layers.
- Utilize Spring Boot annotations and dependency injection for clean and maintainable code.
- Apply object-oriented programming principles like encapsulation and abstraction.
- Develop a repository interface with an in-memory data storage implementation.
- Implement service layer logic to handle user operations.
- Write comprehensive unit tests with JUnit 5 to ensure correctness of business logic.
- Adhere to best practices in version control with clear commit messages and branching strategies.

## Technologies and Tools

- Java 17
- Spring Boot (spring-boot-starter-web)
- JUnit 5 for unit testing
- Gradle for build automation and dependency management

## Getting Started

### Prerequisites

- JDK 17 or higher installed
- Gradle installed or use the Gradle Wrapper included in the project
- An IDE or text editor of your choice

### Running the Application

1. Clone the repository:

   git clone <repository-url>


Navigate into the project directory:
cd spring-boot-user-demo 

Run the application using Gradle:
./gradlew bootRun

The application will run, and user operation messages will be displayed in the console.

Running Tests

Execute the unit tests using Gradle:
./gradlew test

Test results will verify the behavior of user addition, retrieval, and deletion through the service layer.

Project Structure

src/
├── main/
│   ├── java/com/example/demo/
│       ├── model/User.java
│       ├── repo/FakeRepoInterface.java
│       ├── repo/FakeRepo.java
│       ├── service/UserService.java
│       ├── service/UserServiceImpl.java
│       └── DemoApplication.java
└── test/
    └── java/com/example/demo/service/UserServiceTests.java
build.gradle
README.md
