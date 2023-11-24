package lec6;

import java.util.*;

public class convertToBaseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 6;
            sum += rem * mul;
            n /= 6;
            mul *= 10;
        }
        System.out.println(sum);
        sc.close();
    }

}
