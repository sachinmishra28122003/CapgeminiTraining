import java.util.*;
import java.io.*;
public class SystemFrequency {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Directory.java");
            Scanner sc = new Scanner(fis);
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                for(String str : parts) {
                    if(str.contains("System")) {
                        count++;
                    }
                }
            }

            System.out.println("System word frequency is  : " + count);
        }catch (IOException e) {
            System.out.println("IOException  : " + e.getMessage());
        }
    }
}
