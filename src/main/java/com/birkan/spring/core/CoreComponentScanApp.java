package com.birkan.spring.core;

import com.birkan.spring.core.animals.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CoreComponentScanApp {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(CoreComponentScanApp.class);

        System.out.println("Getting the names of the beans that i found during scanning: ");

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }


        System.out.println("Getting the implementation of animals from applicationContext");

        Animal bean = applicationContext.getBean(Animal.class);
        bean.sayHello();

        Animal cat = (Animal) applicationContext.getBean("cat");
        cat.sayHello();
    }

}