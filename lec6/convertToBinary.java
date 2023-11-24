package lec6;

import java.util.*;

public class convertToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long mul = 1;
        while (n > 0) {
            int rem = n % 2;
            sum += rem * mul;
            n /= 2;
            mul *= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
