import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String dir = sc.next();
            File f=  new File(dir);
            System.out.println("Opened Directory : " + f.isDirectory());
            File[] files = f.listFiles();
            Arrays.sort(files,
                    (a, b) ->
                            Long.compare(a.length(), b.length()));

            // for decending b.length() - a.length();
            for(File f1: files) {
                System.out.print(f1.length() + " FILE NAME  : " + f1);
                String[] name = f1.getName().split("\\.");
                if(name[1].contains("java")) {
                    System.out.println(" THIS IS A JAVA FILE !!");
                }
                else {
                    System.out.println(" Type : " + name[1]);
                }
            }
        }catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
