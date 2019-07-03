package com.birkan.spring.core;

import com.birkan.spring.core.animals.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class CoreComponentScanApp {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(CoreComponentScanApp.class);

        Logger logger = LoggerFactory.getLogger(CoreComponentScanApp.class);

        logger.info("Getting the implementation of animals from applicationContext");

        Animal bean = applicationContext.getBean(Animal.class);
        bean.sayHello();

        Animal cat = (Animal) applicationContext.getBean("cat");
        cat.sayHello();
    }

}