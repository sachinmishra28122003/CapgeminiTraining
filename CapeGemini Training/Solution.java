import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String args[]) {
//        String str = "HELLO SACHIN.";
        try{// read in byte
            FileInputStream fin = new FileInputStream("data.txt");// for java adresses only uses "/" for address it automaticaaly convert for windows "\\ "
            FileOutputStream fout = new FileOutputStream("dataCopy.txt");
            InputStreamReader in = new InputStreamReader(fin); // byte to text

            // file reader read file in text// file input  stream directly in scanner
            int ch = fin.read();
            boolean s = true;

            // Alter nate character
//            while(ch != -1) {
//                if(s) fout.write(ch);
//                s = !s;
//                ch = fin.read();
//
//            }
//            AlterNate Word
//            while(ch != -1) {
//                if(s) fout.write(ch);
//                if(ch == 32) s = !s;
//                ch = fin.read();
//            }
            // Alter nate line
            while(ch != -1) {
                if(ch == 10) s = !s;
                if(s) fout.write(ch);
                ch = fin.read();
            }


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//interface  A {
//    int a = 10;
//}
//interface B {
//    int a = 10;
//}
//class Temp implements A, B {
//
//}