import java.util.*;
public class LargestRectangleArea {
    public static void largestArea(int arr[]) {
        int left[] = new int[arr.length];
        int largest = 0;
        int right[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        s.clear();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            right[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        // area 
        for(int i = 0; i< arr.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = arr[i] * width;
            largest = Math.max(largest, area);
        }

        System.out.println("Largest Area : " +largest);
    }
    public static void main(String args[]) {
        int arr[] = {2,1,5,6,2,3};
        int arr2[] = {6,2,5,4,5,1,6};
        largestArea(arr);
        largestArea(arr2);
    }
}
