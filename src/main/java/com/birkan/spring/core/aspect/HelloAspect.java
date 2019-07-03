package com.birkan.spring.core.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    private static final Logger logger = LoggerFactory.getLogger(HelloAspect.class);

    @Before("execution(* com.birkan.spring.core.animals.Animal.sayHello())")
    public void beforeHello(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + " method called!");
    }
}
