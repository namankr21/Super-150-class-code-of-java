package lec4;
import java.util.*;
public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            int val = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(val + "    ");
                val = ((row - col) * val) / (col + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}