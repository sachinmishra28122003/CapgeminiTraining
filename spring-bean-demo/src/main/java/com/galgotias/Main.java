package com.galgotias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // method 1 of creating a bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.scan("com.galgotias");

        Calc bean1 = context.getBean(ImplementCalc.class);
        System.out.println(bean1.add(5, 3));

        context.close();
//        PasswordHasher bean  = context.getBean(PasswordHasher.class);
//        System.out.println(bean);
//
//        PasswordHasher bean2 = context.getBean(PasswordHasher.class);
//        System.out.println(bean2);
//        System.out.println(bean.hash("Hello"));
////        context.close();
//
//        // get beanConfiguration
//
//        StringBuilder bean3 = context.getBean(StringBuilder.class);
//        System.out.println(bean3);
//
//        Calc bean4 = context.getBean(Calc.class);
//        System.out.println(bean4);
//
//        String[] beans = context.getBeanDefinitionNames();
//
//        for(String b: beans) {
//            System.out.println(b);
//        }
//
//        Object bean5 = context.getBean("implementCalc");
//        System.out.println(bean5);
//
//        // creating through bean configuration
//        Object bean6  = context.getBean("getCalc");
//
//
//        Object bean7 = context.getBean("getDataSource");
//        System.out.println(bean7);
//
//
//
//
//        Object bean8 = context.getBean("getString1");
//        System.out.println(bean8);
//        Object bean9 = context.getBean("getString1");
//        System.out.println(bean9);
//        Object bean10 = context.getBean("getString1");
//        System.out.println(bean10);
//
//        System.out.println(bean9 == bean10);

        // Making through XML
//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
////        context2.refresh();
//        Object bean11 = context2.getBean("myXmlCalc");
//        System.out.println(bean11);
//        context2.close();

         // Assignment : create an object of DataSource and inject into spring Context

    }
}