package org.example;

import java.util.HashSet;
import java.util.Set;

public class SumSquareDigitRepeat {
    public static int calculateSumSquare(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0) {
            int digit = temp % 10;
            digit *= digit;
            sum += digit;
            temp /= 10;
        }
        return sum;
    }
    public static boolean stepsToGetBackWithSumDigitSquares(int n) {
        Set<Integer> seen = new HashSet<>();
        int temp = calculateSumSquare(n);  // start from next step

        while (temp != n) {
            if (seen.contains(temp)) {
                return false; // cycle detected, but not back to n
            }
            seen.add(temp);
            temp = calculateSumSquare(temp);
        }

        return true; // we got back to n
    }

    public static void main(String args[]) {
        System.out.println(stepsToGetBackWithSumDigitSquares(16));
    }
}
