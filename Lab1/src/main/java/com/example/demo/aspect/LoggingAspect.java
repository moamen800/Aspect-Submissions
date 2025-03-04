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
        System.out.println(">>> LoggingAspect: Executing before method - " + joinPoint.getSignature().getName());
    }
}
