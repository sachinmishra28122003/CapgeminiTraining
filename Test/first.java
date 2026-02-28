import java.util.List;

public class first {
    public static Node  delete(Node head, int n) {
        if(head == null) 
            return null;
        else if(head.next == null && n == 1) {
            return null;
        }
        Node slow = head;
        Node fast = head.next;
        int count = 1;
        while(fast != null && count < n) 
        {
            fast = fast.next;
            count ++ ;
        }
        System.out.println("Fast "  + fast.data);
        if(fast == null &&  count < n) {
            return head;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Fast : " + fast.data);
        System.out.println("Slow : " + slow.data);
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        delete(head, 2);
        while(head!=null) {
            System.out.print(head.data +" ->");
            head = head.next;
        }
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}