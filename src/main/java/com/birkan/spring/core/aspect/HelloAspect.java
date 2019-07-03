package com.birkan.spring.core.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @Before("execution(* com.birkan.spring.core.animals.Animal.sayHello())")
    public void beforeHello(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + " method called!");
    }
}
