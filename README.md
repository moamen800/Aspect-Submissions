# **Aspect-Submissions**

---

# Lab 1: RESTful APIs with Spring Boot
## **Objective**
This project demonstrates how to build a simple REST API using **Spring Boot** and implement **Aspect-Oriented Programming (AOP)** for logging method calls in a controller.


## **Step 1: Setting Up the Spring Boot Application**
The `DemoApplication.java` is the main entry point for the Spring Boot application.

### **Code:**
```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```
### **Explanation:**
- `@SpringBootApplication` sets up the Spring Boot application.
- `SpringApplication.run(DemoApplication.class, args);` starts the application.

---

## **Step 2: Creating the REST Controller**
The `Controller.java` defines REST endpoints for basic CRUD operations.

### **Code:**
```java
package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/data")
public class Controller {

    @GetMapping
    public String getData() {
        return "GET response";
    }

    @PostMapping
    public String postData() {
        return "POST response";
    }

    @PutMapping
    public String putData() {
        return "PUT response";
    }

    @DeleteMapping
    public String deleteData() {
        return "DELETE response";
    }
}
```
### **Explanation:**
- `@RestController` marks this class as a RESTful web service.
- `@RequestMapping("/api/data")` sets the base path for all endpoints.
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` define the respective HTTP methods.
- Each method returns a simple string response to indicate which HTTP method was called.

---

## **Step 3: Implementing Logging Using AOP**
The `LoggingAspect.java` class logs method executions before they are called.

### **Code:**
```java
package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.controllers.Controller.*(..))")  // FIXED
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(">>> Aspect Triggered Before Method: " + joinPoint.getSignature().getName());
    }
}
```
### **Explanation:**
- `@Aspect` marks this class as an aspect.
- `@Component` makes it a Spring-managed bean.
- `@Before("execution(* com.example.demo.controllers.Controller.*(..))")` ensures that `logBefore` is executed **before any method in the `Controller` class is invoked**.
- `JoinPoint joinPoint` provides details about the intercepted method.
- `System.out.println(">>> Aspect Triggered Before Method: " + joinPoint.getSignature().getName());` prints the method name before execution.

---

## **Step 4: Running and Testing the Application**

### **Starting the Application**
Run the application using:
```
Run the `DemoApplication.java` class.  
```

### **Testing API Endpoints in Postman**
Use **Postman** to test the API by sending the following requests:

| HTTP Method | Endpoint | Expected Response |
|------------|------------|----------------|
| **GET** | `http://localhost:8080/api/data` | `"GET response"` |
| **POST** | `http://localhost:8080/api/data` | `"POST response"` |
| **PUT** | `http://localhost:8080/api/data` | `"PUT response"` |
| **DELETE** | `http://localhost:8080/api/data` | `"DELETE response"` |

### **Console Output (Aspect Triggered Logs)**
Whenever an API request is made, the aspect logs the method call:
```
>>> Aspect Triggered Before Method: getData
>>> Aspect Triggered Before Method: postData
>>> Aspect Triggered Before Method: putData
>>> Aspect Triggered Before Method: deleteData
```

---

## **Conclusion**
In this lab, you:  
✅ Built a **Spring Boot REST API** with CRUD operations.  
✅ Implemented **AOP Logging** to track method executions.  
✅ Used **Postman** to test API responses.  

---
## **Author**
👨‍💻 Developed by **Moamen Ahmed**  
📅 Date: March 4, 2025  
✉️ Contact: moamenahmed800@gmail.com
---