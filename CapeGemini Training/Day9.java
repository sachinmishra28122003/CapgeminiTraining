import java.util.*;
public class Day9 {
    // method overloading 
    public static void addition(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }

    public static void addition(int a, int b, int c) {
        System.out.println("Addition : " + (a+b+c));
    }
    public static void addtion(float a, float b) {
        System.out.println("Addtion : " + (a+b));
    }

    // max overloading
    public static void max(int a, int b) {
        System.out.println("max : " + Math.max(a, b));
    }

    public static void max(int a, int b,int c) {
        System.out.println("Max : " + Math.max(a, Math.max(b, c)));
    }

    public static void max(float a, float b) {
        System.out.println("Max : " + Math.max(a, b));
    }
    public static  void main(String args[]) {
        // question 1
        System.out.println("Question  1");
        addtion(1.0f, 2.0f);
        addition(1, 2);
        addition(1, 2,3);

        //  question  2
        System.out.println("question 2");
        Calculator c = new Calculator();
        c.Calculate(1);
        c.Calculate(1,2);
        c.Calculate(1,2,3);
        c.Calculate(1,2,"");

        // question 3 repeated 
        // question 4
        System.out.println("Question 4");
        Shapes s = new Shapes();
        s.area(2);
        s.area(2,3);
        s.area(1,2,3);

        // question 5
        System.out.println("Question 5");
        max(1.0f, 2.0f);
        max(1, 2);
        max(1, 3,2);

        // question 6
        System.out.println("Question 6");
        Printer p = new Printer();
        p.print(1);
        p.print("Sachin");
        p.print(1, "Sachin");
    }
}

class Calculator {
    // addtion
    void Calculate(int a, int b, int c) {
        System.out.println("addtion " +(a+b + c));
    }
    //  subtraction
    void Calculate(int a) {
        System.out.println("Multiplication : " + (a*a));
    }
    // multiplication
    void Calculate(int a, int b) {
        System.out.println("multiplication : "+ a*b);
    }
    // division
    void Calculate(int a, int b, String m) {
        System.out.println("Division" + (a/b));
    }
}

class Shapes {
    void area(int r){
        System.out.println("Area : " + (r * r * 3.14));
    }
    void area(int len, int breadth) {
        System.out.println("Area  : "+ len * breadth);
    }
    void area(int base , int height, int countofSides) {
        System.out.println("Area  : " + (0.5 * base * height));
    }
}

class Printer {
    void print(int a) {
        System.out.println("Integer : " + a);
    }
    void print(String a) {
        System.out.println("String  :  " + a);
    }
    void print(int a, String s) {
        System.out.println("String + integer :  " + s +" " + a);
    }   
}