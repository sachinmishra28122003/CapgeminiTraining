
public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node add(Node root,int data) {
        if(root == null) {
            return new Node(data);
        }
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return root;
    }

    static void display(Node root) {
        Node temp = root;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    static void reverse(Node root) {
        if(root.next == null) return;
        Node curr = root;
        Node prNode  = null;
        Node next = root.next;

        while(next != null) {
            curr.next = prNode;
            prNode = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prNode;
        root = curr;
        display(root);
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        add(root, 2);
        add(root, 3);
        add(root, 4);
        add(root, 5);
        display(root);
        System.out.println();
        System.out.println("Reversed");
        reverse(root);
    }
}
