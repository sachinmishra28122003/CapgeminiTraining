import java.util.*;
import java.io.*;
public class SerializationExample {
    public static void main(String args[]) {
        try{
            FileOutputStream fout = new FileOutputStream("serail.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fout);
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
// Serializable is called marker interface
class Employees implements Serializable {

}
