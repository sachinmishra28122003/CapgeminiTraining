import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Add extends  Thread{
    int[] arr1 ;
    int[] arr2;
    int[] result ;
    int count = 0;
    public Add(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        result = new int[arr1.length];
    } public  void run() {
        try{
            System.out.println("Inside add Thread");
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] + arr2[i];
            }
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int[] get() {
        return  result;
    }

}
public class AddingMatrix {
    public static  void main(String[] args) {
        int[][] arr1 = {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        int[][] arr2 = {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        List<Add> list = new ArrayList<>();

        Thread t = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                Add a = new Add(arr1[i], arr2[i]);
                a.start();
                try {
                    a.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int[] arr = a.get();
                System.out.println("Row " + (i+1) + " result:");
                for (int res : arr) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
        });
        t.start();
    }
}
