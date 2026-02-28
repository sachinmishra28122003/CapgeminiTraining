import java.util.*;
public class Day1FEB {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Apple Pie");
        arr.add("pineapple");
        arr.add("GreenApple");
        arr.add("Apple Juice");
        System.out.println("Adding fuction");
        for(String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Removind apple");
        arr.remove(0);
        for(String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("Contains pineApple : " + arr.contains("pineapple"));
        ArrayList<String> temp  = new ArrayList<>();
        temp.add("Apple Pie");
        temp.add("GreenApple");
        System.out.println("Contains Apple, GrrenApple  :  " +  arr.containsAll(temp));
        arr.stream();
    }
}


// add , addAll, clear, contains, containsAll, removeAll, retainAll, size, isEmpty, iterator, stream,  parallelstream, toArray, equals, hashcode
// above are default function of Collection