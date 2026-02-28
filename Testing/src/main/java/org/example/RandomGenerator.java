package org.example;

import java.util.Random;

public class RandomGenerator {
    public static  int[] get10Random() {
        int[] result = new int[10];
        Random r = new Random();
        for(int i = 0; i < result.length; i++) {
           result[i] = r.nextInt(1, 11);
        }
        for(int i: result){
            System.out.println(i);
        }
        return result;
    }
}
