public class StackO1 {
    int arr[] = new int[100];
    int head = -1;
    static int size = 0;
    public void push(int data) {
        if(size == 0) {
            arr[0] = data;
            head = 0;
            size = 1;
            return;
        }
        int temp = size - 1;
        while(temp > 0 & arr[temp] > data) {
            arr[temp + 1] = arr[temp];
            temp--;
        }
        arr[temp] = data;
        size++;
    }
    public int pop() {
        int delete = arr[head];
        head ++;
        size --;
        return delete;
    }
    
    public int getMIN() {

        return arr[size - 1];
    }
    public int getMax() {
        return arr[head];
    }

    public static void main(String args[]) {
        StackO1 s = new StackO1();
        s.push(0);
        s.push(4);
        s.push(5);
        s.push(2);
        for(int i = 0; i < size; i++) {
            System.out.print(s.arr[i] + " ");
        }
        System.out.println("MAX : " + s.getMax());
        System.out.println("MIN : " + s.getMIN());
    }
}
