package com.birkan.spring.core.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public void sayHello() {
        System.out.println("meow");
    }
}
