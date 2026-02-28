public class MinMaxLinkedList {
    public static Node head = null;
    public static Node tail = null;

    public  void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (data <= head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
        return;
        }
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data != data) {
            temp = temp.next;
        }
         if (temp.next != null && temp.next.data == data) {
            if(temp.next.data == tail.data) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }

    }

    public int getMin() {
        return head.data;
    }

    public int getMax() {
        return tail.data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MinMaxLinkedList list = new MinMaxLinkedList();
        list.insertSorted(1);
        list.insertSorted(6);
        list.insertSorted(2);
        list.insertSorted(4);
        list.insertSorted(9);
        list.insertSorted(7);
        list.print();
        System.out.println("MIN : " + list.getMin());
        System.out.println("MAX : " + list.getMax());
        list.delete(9);
        list.print();
        System.out.println("MAX : " + list.getMax());
    }
}

class LNode {
    int data;
    Node next;

    LNode(int data) {
        this.data = data;
        this.next = null;
    }
}