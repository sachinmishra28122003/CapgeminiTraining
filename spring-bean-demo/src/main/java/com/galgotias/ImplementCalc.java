package com.galgotias;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ImplementCalc implements Calc{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @PostConstruct // after calling the constructor call this constructor and dependecy Injection
    public void onInit() {
        System.out.println("Initialzation method for");
    }

    @PreDestroy // before destroying the bean
    public void onDestroy() {
        System.out.println("Object Destroyed");
    }
}
