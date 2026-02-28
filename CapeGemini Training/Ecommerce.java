import java.util.*;
public class Ecommerce {
    HashMap<String, String[]> productMap = new HashMap<>();
    void add(String s, String[] a) {
        this.productMap.put(s, a);
    }

    String[] get(String key) {
        return this.productMap.get(key);
    }

    int size() {
        return this.productMap.size();
    }

    boolean remove(String key) {
        return this.productMap.remove(key).length != 0;
    }
    public static void main(String[] args) {
        Ecommerce e = new Ecommerce();
        String[] s = {"M31","5000 mAh", "14999" };
        String[] s2 = {"Nord 5", "6500 mAh", "30000"};
        String[] s3 = {"g86", "6000mAh", "18000"};
        e.add("Samsung", s);

        e.add("ONE plus", s2);

        e.add("Motorola", s3);

        for(String a : e.get("Samsung")) {
            System.out.print(a + " ");
        }
        System.out.println();
       for(String a : e.get("ONE plus")) {
            System.out.print(a + " ");
        }
        System.out.println();
        for(String a : e.get("Motorola")) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Removing Motorola");

        e.remove("Motorola");

        System.out.println();
        for(String a : e.get("Samsung")) {
            System.out.print(a + " ");
        }
        System.out.println();
        for(String a : e.get("ONE plus")) {
            System.out.print(a + " ");
        }
    }
}
