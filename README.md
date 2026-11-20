# Common Library (`common-library`)

Shared Java Library for the Jenkins Microservices CI/CD Lab.

## Overview
This library provides common models, DTOs, response wrappers, exception definitions, and utility classes shared across microservices (`user-service`, `product-service`, `order-service`, `api-gateway`).

It is built as a standard reusable **Maven JAR** dependency (not a Spring Boot executable fat JAR).

## Maven Coordinates
```xml
<dependency>
    <groupId>com.lab</groupId>
    <artifactId>common-library</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Structure
- `com.lab.common.constants`: Global constants and formats.
- `com.lab.common.dto`: Common DTOs.
- `com.lab.common.exception`: Base exception classes (`ApiException`).
- `com.lab.common.response`: Standard API response (`ApiResponse<T>`) and error response (`ErrorResponse`).
- `com.lab.common.utils`: Utility helpers (`DateTimeUtils`, `StringUtils`).

## Build
```bash
# Run tests
mvn clean test

# Build JAR
mvn clean package

# Install to local Maven repository (~/.m2)
mvn clean install
```
