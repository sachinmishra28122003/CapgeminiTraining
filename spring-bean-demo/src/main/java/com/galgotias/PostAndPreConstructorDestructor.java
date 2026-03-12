package com.galgotias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostAndPreConstructorDestructor {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.scan("com.galgotias");
//        Object bean = context.getBean(ImplementCalc.class);
//        System.out.println(bean);
//        context.close();
        UserVerifier bean2 = context.getBean(UserVerifier.class);
        bean2.verifyUser();

    }
}
