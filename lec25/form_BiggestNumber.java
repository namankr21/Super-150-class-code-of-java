package lec25;

import java.util.*;

public class form_BiggestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            Sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();

        }

    }

    public static void Sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (compare(arr[j], arr[j + 1])) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }

        }

    }
    public static boolean compare(int n1, int n2) {
        String s1 = "" + n1 + n2;

        String s2 = "" + n2 + n1;

        if (Long.parseLong(s2) > Long.parseLong(s1)) {
            return true;
        }
        return false;

    }

}