import java.util.*;
public class QuestionsOnString {
    public static void LinePresent(String sentence) {
        // calculate line position length 4 take window of 4
        int i = 0;
        int j = 4;
        while(j < sentence.length()) {
            if(sentence.substring(i,j).toLowerCase().equals("line")) {
                System.out.println("Line Found at  : " + i);
            }
            j++;
            i++;
        }
    }

    public static void convertStringTitle(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println(str);
            return;
        }
        StringBuilder result = new StringBuilder(str);
        boolean isCapital = true;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') {
                isCapital = true;
            } else if (isCapital) {
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
                isCapital = false;
            }
        }

        System.out.println(result.toString());
    }
    public static void main(String args[]) {
        // DAte

        LinePresent("this is a line. Line contains few words. Line is in java");
        Scanner sc = new Scanner(System.in);
        String date =  sc.next();
        String[] parts = date.split("[./-]");
        String result = "";
        for(String str : parts) {
            result += str;
        }
        System.out.println("Date to String  : " + result);

        // first character of every word should be in

        convertStringTitle(
                "This is java lang"
        );
    }
}
