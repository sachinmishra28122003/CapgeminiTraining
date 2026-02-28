import java.io.*;
import java.util.Scanner;

public class ReadHalfLine {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("data.txt");
            FileOutputStream out = new FileOutputStream("dataCopy.txt");
            PrintWriter pw = new PrintWriter(out);
            Scanner sc = new Scanner(fin);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] part = line.split(" ");
                String result = "";
                for(int i = 0; i < part.length/2; i++) {
                    result += part[i] + " ";
                }
                pw.println(result.trim());
            }
            pw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
