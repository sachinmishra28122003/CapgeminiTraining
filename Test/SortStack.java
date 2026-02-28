import java.util.*;
public class SortStack {
    static Stack<Integer> s = new Stack<>();
    public static void sort() {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        sort();
        sortInsert(top);
    }
    public static void sortInsert(int top) {
        if(s.isEmpty() || s.peek() > top) {
            s.push(top);
            return;
        }
        int temp = s.pop();
        sortInsert(top);
        s.push(temp);
    }
    public static void main(String args[]) {
        s.push(1);
        s.push(5);
        s.push(6);
        s.push(3);
        s.push(2);
        s.push(9);
        sort();
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
