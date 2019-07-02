package com.birkan.spring.core.animals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {


    public void sayHello() {
        System.out.println("woof-woof");
    }
}
