import java.io.*;
public class PrintLastTwoBytes {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("data.txt", "r");

            long fileLength = raf.length();
            raf.seek(fileLength - 2);
            for (int i = 0; i < 2; i++) {
                System.out.print((char) raf.read());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }



    }
}
