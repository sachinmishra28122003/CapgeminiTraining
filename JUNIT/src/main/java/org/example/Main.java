package org.example;
import java.util.Scanner;
public class Main {
    /**
     *
     * @param str : not null string of length min
     * @return 2  character of first
     */
    public static String rotate(String str){
        //****** Edge Cases ********//
        // can input be null
        // length  of input >= 2
        // what to return in case of Exception

//        if(str.length() < 3) {
//            return str;
//        }
        String str1 = str.substring(0,2);
        String str2 = str.substring(2,str.length() );
        return  str2 + str1;
    }

    public static int[] bubbleSort(int[] arr)  {
//        if(arr.length == 1) {
//            return  arr;
//        }
        boolean swap = false;
        for(int i = 0; i < arr.length  ; i++) {
            swap = false;
            for(int j = 1; j < arr.length; j++) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
        return arr;
    }
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int arr[] = { 1};
//        int arr2[] = bubbleSort(arr);
//        for(int a: arr2) {
//            System.out.println(a + " ");
//        }
//        System.out.println("Enter String you want to rotate : ");
//        String temp = sc.next();
//        System.out.println(rotate(temp));
        RandomGenerator.get10Random();

    }
}