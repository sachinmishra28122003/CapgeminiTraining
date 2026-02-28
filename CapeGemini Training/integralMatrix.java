public class integralMatrix {
    public static void main(String args[]) {
        int mat[][] = {{1,2,2,4,1},
                        {3,4,1,5,2},
                        {2,3,3,2,4},
                        {4,1,5,4,6},
                        {6,3,2,1,3}};
        int mat2[][] = new int[mat.length + 1][mat.length + 1];

        for(int i  = 1; i < mat2.length; i++) {
            for(int  j = 1; j < mat2[i].length; j++) {
                mat2[i][j] = mat2[i - 1][j] + mat2[i][j - 1]
                            -mat2[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }
        System.out.println("Integral Matrix is  : ");

        for(int[] arr: mat2) {
            for(int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
