package com.galgotias.questionFIleBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.classfile.Annotation;

public class MainWork {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.galgotias.questionFIleBean");
        WordCounter count = context.getBean(WordCounter.class);

        System.out.println(count.wordCount());
    }
}
