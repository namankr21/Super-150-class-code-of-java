package lec16;

public class spiral_print {
    public static void main(String[] args) {
        int[][] matrix = {  { 1, 4, 7, 11, 15 },
                            { 2, 5, 8, 12, 19 },
                            { 3, 6, 9, 16, 22 },
                            { 10, 13, 14, 17, 24 },
                            { 18, 21, 23, 26, 30 } };
        print(matrix);

    }

    public static void print(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total_print = arr.length * arr[0].length;
        int count = 0;
        while (count < total_print) {
            for (int i = minc; i <= maxc && count < total_print; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count < total_print; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count < total_print; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < total_print; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }

    }
}
