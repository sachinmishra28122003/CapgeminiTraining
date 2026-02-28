import java.util.*;

public class StackUsingTwoQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>(); // main
        static Queue<Integer> q2 = new LinkedList<>(); //  helper
        void push(int data) {
            q2.add(data);
            while(!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            //  adding back to queue
            while(!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
        int pop() {
            if(isEmpty()) {
                return  -1;
            }
            return q1.remove();
        }
        int peek() {
            return q1.peek();
        }
        boolean isEmpty() {
            return q1.size() == 0;
        }
     }
    public static void main(String argss[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
