package com.birkan.spring.core.animals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    private static final Logger logger = LoggerFactory.getLogger(Cat.class);

    public void sayHello() {
        logger.debug("meow");
    }
}
