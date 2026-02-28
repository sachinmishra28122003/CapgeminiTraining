package org.example;

public class StringQuestions {
    // Date to format
    public static String date(String input) {
        String[] parts = input.split("[./-]");

        if(Integer.parseInt(parts[2]) > 26 && Integer.parseInt(parts[2]) < 100) {
            parts[2] = "19" + parts[2];
        }
        else if(Integer.parseInt(parts[2]) < 26 && Integer.parseInt(parts[2]) < 100) {
            parts[2] = "20" + parts[2];
        }
        String result = parts[0] +
                parts[1] + parts[2];
        return  result;
    }

    public static void main(String args[]) {
        String date = "01.01.99";
        System.out.println(date(date));
    }
}
