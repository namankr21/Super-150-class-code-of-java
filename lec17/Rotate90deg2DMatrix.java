package lec17;

public class Rotate90deg2DMatrix {
    public static void main(String[] args) {
        int[][] matrix =  { { 5, 1, 9, 11 }, 
                            { 2, 4, 8, 10 }, 
                            { 13, 3, 6, 7 }, 
                            { 15, 14, 12, 16 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("After rotation : ");
        RotateImage(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void RotateImage(int[][] matrix) {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
