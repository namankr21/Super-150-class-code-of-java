package lec5;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		long num = sc.nextLong();
		System.out.print(0 + "      ");
		for (long i = 0; i < num - 1; i++) {
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.print(n3 + "     ");
		}
		sc.close();
	}
}
