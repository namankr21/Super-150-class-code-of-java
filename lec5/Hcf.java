package lec5;

import java.util.*;

public class Hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int devisor = sc.nextInt();
		int divident = sc.nextInt();
		int rem = 0;
		while (divident % devisor != 0) {
			rem = divident % devisor;
			divident = devisor;
			devisor = rem;
		}
		System.out.println("HCF is : " + rem);
		sc.close();
	}
}
