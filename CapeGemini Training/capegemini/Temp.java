public class Temp {

    public static int countEven(int[] arr) {
        int count = 0;
        for(int i = 0 ;i< arr.length; i++) 
            if(i % 2 == 0) count++;
        return count;
    }
    
    public static int countOdd(int[] arr) {
        int count  = 0;
        for(int i = 0; i < arr.length; i++) {
            if( i % 2 != 0) count ++;
        }
        return count;
    }

    // sum of given elements
    public static int sum(int arr[]) {
        int count = 0;
        for(int i : arr) count+=i;
        return count;
    }

    // find min
    public static int min(int[] arr) {
        int m = Integer.MAX_VALUE;
        for(int i : arr) m = Math.min(m,i);
        return m;
    }

    // find max
    public static int max(int[] arr) {
        int m = Integer.MIN_VALUE;
        for(int i : arr) m = Math.max(i, m);
        return m;
    }

    // second max
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = arr[0];
        for(int i : arr) {
            if(i > max) {
                second = max;
                max = i;
            }
        }
        return second;
    }

    // average
    public static double average(int arr[]) {

        return sum(arr)/(double)arr.length;
    }

    // sum of all even index

    public static int sumOfEven(int arr[]) {
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++) 
            if(i % 2 == 0) sum += arr[i];

        return sum;
    }

    // sum of odd indexed 
    public static int sumOfOdd(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) 
            if(i % 2 != 0) 
                sum += arr[i];
        return sum;
    }

    // min form even 
    public static int minEven(int arr[] ) {
        int m = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++)
            if(i % 2 == 0 && m > arr[i]) 
                m =  arr[i]; 
        return m;
    }

    // max odd
    public static int maxOdd(int arr[]) {
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) 
            if(i % 2 != 0 && m < arr[i]) m = arr[i];

        return m;
    }

    // average from even
    public static double avEven(int arr[]) {
        int len = countEven(arr);
        return sumOfEven(arr)/(double)len;
    }

    // average of odd
    public static double avOdd(int arr[]) {
        int len = countOdd(arr);
        return sumOfOdd(arr)/(double)len;
    }

    //sum of first Half
    public static int sumHalf(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length / 2 ; i++) sum += arr[i];
        return sum;
    }

    // sum of second half
    public static int sumSecondHalf(int arr[]) {
        int sum = 0; 
        for(int i = arr.length/2; i < arr.length; i++) sum += arr[i];
        return sum;
    }

    //max of firstHalf
    public static int maxFirstHalf(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length/2; i++) max = Math.max(max, arr[i]);
        return max;
    }
    // max of seond half
    public static int maxSecondHalf(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = arr.length / 2; i<arr.length; i++) max = Math.max(max, arr[i]);
        return max;
    }
    //av of first half 
    public static double avFirstHalf(int arr[]) {
        int sum = 0 ;
        for(int i = 0 ; i < arr.length/2; i++) sum += arr[i];
        return sum/ (double)(arr.length/2);
    }
    // av of seond half
    public static double avSecondHalf(int arr[]) {
        int sum = 0;
        for(int i  = arr.length/2; i < arr.length; i++) sum += arr[i];
        return sum / (double)(arr.length/2);
    }
    // read in reverse order
    public static void readReverse (int arr[]){
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1,2,3,4};
        System.out.println("Sum of the given elements : " + sum(arr));

        System.out.println("Minimum in array : " + min(arr));

        System.out.println("Maximum in array : " + max(arr));

        System.out.println("Second Max : " + secondMax(arr));

        System.out.println("Average of array : " + average(arr));

        System.out.println("Sum of even indexed : " + sumOfEven(arr));

        System.out.println("Sum of odd Indexed array : " + sumOfOdd(arr));

        System.out.println("Even indexed MInimum : " + minEven(arr));

        System.out.println("Odd indexed maximum : " + maxOdd(arr));

        System.out.println("Average of Even  : " + avEven(arr));

        System.out.println("Average of odd : " + avOdd(arr));

        System.out.println("First Halpf sum :  " + sumHalf(arr));

        System.out.println("Second Half Sum : " + sumSecondHalf(arr));

        System.out.println("Maximum in first half  :  " + maxFirstHalf(arr));

        System.out.println("Maximum in second half : " + maxSecondHalf(arr));

        System.out.println("Average of firstHalf : " + avFirstHalf(arr));

        System.out.println("Average of second Half : "  + avSecondHalf(arr));

        System.out.println("ARRAY IN REVERSE ORDER: ");
        readReverse(arr);
    }
}