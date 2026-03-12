package com.galgotias;

import org.springframework.stereotype.Component;

@Component // for let IOC container know that Ioc container make this class Object
public class PasswordHasher {
    public String hash(String password) {
        return new StringBuilder(password)
                .reverse().
                toString();
    }

    public PasswordHasher() {
        System.out.println("PasswordHasher Object Created");
    }
}
