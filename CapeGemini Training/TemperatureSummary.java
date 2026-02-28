import java.io.*;
import java.util.*;

public class TemperatureSummary {
    public static void main(String[] args){
        try{
            FileInputStream fin = new FileInputStream("Temperature.txt");
            FileOutputStream fout = new FileOutputStream("SummaryTemperature.txt");
            Scanner sc = new Scanner(fin);
            PrintWriter pw = new PrintWriter(fout);
            pw.println("Summary for the Temperature : ");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                String weekName = parts[0];
                double sum = 0;
                int count = 7;
                for (int i = 1; i < parts.length; i++) {
                    sum += Double.parseDouble(parts[i]);
                }
                double average = sum / count;

                pw.println(weekName + " : Average = " + average);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
