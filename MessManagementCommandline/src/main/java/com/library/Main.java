package com.library;

import org.sachin.model.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Supplier s1 = new Supplier();
        s1.setCity("Delhi");
        System.out.println(s1.getCity());
    }
}