package lec9;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int len = sc.nextInt();
        // int arr[] = new int[len];
        int arr[] = { 1, 2, 34, 5, 6, 7, 8, 9 };
        // for(int i=0;i<len;i++)
        // arr[i] = sc.nextInt();
        int n = sc.nextInt();
        // int n = 2;
        System.out.println(inArray(arr, n));
        sc.close();
    }

    public static int inArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num)
                return i;

        return -1;
    }

}