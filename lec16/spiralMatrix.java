package lec16;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, 
                        { 2, 5, 8, 12, 19 }, 
                        { 3, 6, 9, 16, 22 }, 
                        { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } };
        int n = 5;
        // int m = 5;
        int row = 0;
        int col = 0;
        int var = 0;
        int var2 = 1;
        {
            for (int i = var; i < n; i++) {
                System.out.print(arr[row][col] + " ");
                col++;
            }
            var++;
            col -= var;
            row += var;
            while (row <= n - var) {
                System.out.print(arr[row][col] + " ");
                row++;
            }
            row -= var;
            col -= var;
            while (col >= var - var2) {
                System.out.print(arr[row][col] + " ");
                col--;
            }
            col = var - 1;
            while (row > var2) {
                System.out.print(arr[row][col] + " ");
                row--;
            }
            System.out.println("row : " + row + " col : " + col);

        }
    }
}
