package lec4;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int star = n;
        do {
            int i = 1;
            do {
                System.out.print("* ");
                i++;
            } while (i <= star);
            row++;
            System.out.println();

        } while (row <= n);

    }
}
