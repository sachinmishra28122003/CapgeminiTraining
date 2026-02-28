import javax.sound.sampled.ReverbType;

public class Day5Revision {
    // Q26
    // read odd indexed 
    public static void readOdd(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    //Q27
    //find out indexes of a specified element
    public static int findIndex(int arr[], int key) {
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == key) 
                return i;
        }
        return -1;
    }

    // read odd in reverse 
    public static void readOddReverse(int arr[]) {
        for(int i = arr.length - 1; i >= 0; i--) {
            if(i % 2!= 0)
                System.out.print(arr[i] +" ");
        }
    }

    // swap two given indexed 
    public static void swap(int arr[], int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // display
    public static void display(int arr[]) {
        for(int i = 0 ;i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }

    // reverse element of given array 
    public static void reverse(int arr[]) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        display(arr);
    }

    // reverse only the first Half
    public static void reverseFirstHalf(int arr[]) {
        for(int  i = 0 ; i < (arr.length/2)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length/2 - 1-i];
            arr[arr.length/2 - 1 - i] = temp;
        }
        display(arr);
    }

    // reverse last half
    public static void reverseLastHalf(int arr[]) {
        int i = arr.length/2;
        int j = arr.length - 1;
        while(j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        display(arr);
    }

    //Reverse only even indexed of the elements of given array
    public static void reverseEvenIndexed(int arr[]) {
        int i = 0 ;
        int j = arr.length - 1;
        while(i < j ) {
            while(i % 2 != 0) i++;
            while(j % 2 != 0) j--;
            if(i >= j) break; 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        display(arr);
    }

    //  Reverse only odd indexed of the elements of given array?
    public static void reverseOddIndexed(int arr[]) {
        int i = 0; 
        int j = arr.length - 1;
        while(i < j) {
            while(i % 2 == 0) i++;
            while(j % 2 == 0) j--;
            if(i >= j) break; 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        display(arr);
    }

    // swap odd indexed with immediate next 
    public static void swapNextEven(int arr[]) {
        for(int i = 1 ; i < arr.length; i++) {
            if(i + 1 >= arr.length) break;
            else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i += 1;
            }
        }
        display(arr);
    }

    // right shift by  one 
    public static void rightShift(int arr[]) {
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
        // int temp = arr[0];
        // for(int i = 1; i < arr.length; i++) {
        //     int temp2 = arr[i];
        //     arr[i] = temp;
        //     temp = temp2;
        // }
        // arr[0] = 0;
        display(arr);
    }

//     37 Do right shift by two for elements of given array?
    public static void rightShift2(int arr[]) {
        for(int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i-2];
        }
        arr[0] = 0;
        arr[1] = 0;
        display(arr);
    }


    // 38 Do right shift by three for elements of given array?
    public static void rightShift3(int arr[]) {
        for(int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 3];
        }
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        display(arr);
    }

    // 39 Do left shift by one for elements of given array?
    public static void leftShift(int arr[]) {
        for(int i = 0 ; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        display(arr);
    }
    // 40 Do left shift by two for elements of given array?
    public static void leftShift2(int arr[]) {
        for(int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[arr.length - 1] = 0;
        arr[arr.length - 2] = 0;
        display(arr);
    }
    // 41 Do left shift by three for elements of given array?
    public static void leftShift3(int arr[]) {
        for(int i = 0; i < arr.length - 3; i++) {
            arr[i] = arr[i + 3];
        }
        arr[arr.length - 1] = 0;
        arr[arr.length - 2] = 0;
        arr[arr.length - 3] = 0;
        display(arr);
    }
    // 42 Do right rotate by one for elements of given array?
    public static void rightRotateby1(int arr[]) {
        int temp = arr[arr.length - 1] ;
        for(int i = arr.length - 1 ; i > 0; i --) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        display(arr);
    }
    // 43 Do right rotate by two for elements of given array?
    public static void rightRotateby2(int arr[]) {
        int temp1 = arr[arr.length - 1];
        int temp2 = arr[arr.length - 2];
        for(int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 2];
        }
        arr[0] = temp1;
        arr[1] = temp2;
        display(arr);

    }
    // 44 Do right rotate by three for elements of given array?
    public static void rightRotateby3(int arr[]) {
        int temp1 = arr[arr.length - 1];
        int temp2 = arr[arr.length - 2];
        int temp3 = arr[arr.length - 3];
        for(int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 3];
        }
        arr[0] = temp1;
        arr[1] = temp2;
        arr[2] = temp3;
        display(arr);
    }
    // 45 Do left rotate by one for elements of given array?
    public static void leftRotateby1(int arr[]) {
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        display(arr);
    }
    public static void main(String args[]) {
        int arr[] = { 1,2,3,4,5};
        // System.out.println("Read Odd indexed :  ");
        // // readOdd(arr);
        // System.out.println();

        // System.out.println("Find Index : " + findIndex(arr, 3));

        // System.out.println("Array in reverse ONly odd indexed : ");
        // // readOddReverse(arr);
        // System.out.println();

        // // swap(arr, 1, 3);

        // // System.out.println("Reversed array  :" );
        // // reverse(arr);
        // // System.out.println();

        // System.out.println("Half reversed");
        // // reverseFirstHalf(arr);

        // System.out.println("Last Half");
        // // reverseLastHalf(arr);

        // System.out.println("Reverse Even : ");
        // // reverseEvenIndexed(arr);

        // System.out.println("Reverse Odd : ");
        // // reverseOddIndexed(arr);

        // System.out.println("Swap immediate even : " );
        // // swapNextEven(arr);

        // System.out.println("Right  shift by one  : ");
        // rightShift(arr);
        // System.out.println("Right Shift 2  : ");
        // rightShift2(arr);
        // System.out.println("Right shift by 3  : ");
        // rightShift3(arr);

        // System.out.println("Left Shift 1 : ");
        // leftShift(arr);

        // System.out.println("Left Shift 2 : ");
        // leftShift2(arr);

        // System.out.println("Left Shift 3 : ");
        // leftShift3(arr);

        // System.out.println("Rotate by one array  : ");
        // rightRotateby1(arr);

        // System.out.println("Rotate array by 2");
        // rightRotateby2(arr);

        // System.out.println("Rotate array by 3");
        // rightRotateby3(arr);

        System.out.println("Left rotate by 1 : ");
        leftRotateby1(arr);

    }
}