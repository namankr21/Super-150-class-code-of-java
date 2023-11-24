package lec21;

import java.util.*;

public class Sum_Of_Two_Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];

        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int arr2[] = new int[m];
        sc.close();
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        // int[] arr1 = { 1, 0, 4, 9, 6 };
        // int[] arr2 = { 3, 4, 5, 6, 7, 8, 3 };

        // int i = n-1,j=m-1;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = 0;
            sum = arr1[i] + arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;

        }
        while (i >= 0) {
            int sum = 0;
            sum = arr1[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = 0;
            sum = arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        if (carry != 0) {
            list.add(carry);
        }
        for (int k = list.size() - 1; k >= 0; k--) {

            System.out.print(list.get(k) + ", ");

        }

        System.out.println("END");

    }
}