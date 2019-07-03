package com.birkan.spring.core.animals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

    private static final Logger logger = LoggerFactory.getLogger(Dog.class);

    public void sayHello() {
        logger.debug("woof-woof");
    }
}
