# Simple-Java-Micro-Services-App

This repository contains a set of microservices built using the Spring Cloud framework. The project consists of the following modules:

1. **EurekaServer**
   - Description: EurekaServer is a service registry and discovery server.
   - Technology: Spring Cloud Netflix Eureka Server
   - Java Version: 1.8
   - Spring Boot Version: 2.7.5
   - Spring Cloud Version: 2021.0.5

2. **Gateway**
   - Description: Gateway is a project serving as an API gateway for the microservices.
   - Technology: Spring Cloud Gateway, Spring WebFlux
   - Java Version: 1.8
   - Spring Boot Version: 2.7.5
   - Spring Cloud Version: 2021.0.5

3. **CourseApp**
   - Description: CourseApp is a microservice handling courses.
   - Technology: Spring Boot Starter Data REST, Spring Web
   - Java Version: 1.8
   - Spring Boot Version: 2.7.5
   - Spring Cloud Version: 2021.0.5

4. **UserApp**
   - Description: UserApp is a microservice managing user-related functionalities.
   - Technology: Spring Boot Starter Data REST, Spring Web
   - Java Version: 1.8
   - Spring Boot Version: 2.7.5
   - Spring Cloud Version: 2021.0.5

## Prerequisites
- Java 1.8 or higher
- Maven
- Spring Boot
- Spring Cloud

## Building and Running
1. Clone the repository to your local machine.
2. Navigate to each module directory and run the following command to build the project:

   ```bash
   mvn clean install
   ```

3. After building all modules, navigate to each module's target directory and run the following command to start the services:

   ```bash
   java -jar <module-name>.jar
   ```

   Replace `<module-name>` with the respective module's JAR file.

## Service URLs
- EurekaServer: [http://localhost:8761](http://localhost:8761)
- Gateway: [http://localhost:8080](http://localhost:8080)
- CourseApp: [http://localhost:8081](http://localhost:8081)
- UserApp: [http://localhost:8082](http://localhost:8082)

## Service Discovery
- EurekaServer serves as the service registry, and other services register with it for service discovery.

## API Gateway
- Gateway provides a single entry point for accessing the microservices and handles routing.

## Microservices
- CourseApp and UserApp are independent microservices focusing on specific functionalities.

Feel free to explore each module's README for more specific instructions on how to run and interact with the individual services.
