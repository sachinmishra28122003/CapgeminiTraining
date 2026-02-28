public class practice  {
    public static void main(String args[]) {
        BASE b =  new DERIVED();
        b.display();

        DERIVED.display();
    }
}
class BASE {
    static void display() {
        System.out.println("BASE");
    }
}
class DERIVED extends BASE {
    static void display() {
        System.out.println("DERIVED");
    }
}