package com.example.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.User.UserController.*(..))")
    public void logBeforeControllerMethods(JoinPoint joinPoint) {
        System.out.println("Incoming request received.");
        System.out.println("Executing method: " + joinPoint.getSignature().getName());
        System.out.println("With parameters: " + Arrays.toString(joinPoint.getArgs()));
    }
}
