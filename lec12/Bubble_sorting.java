package lec12;

import java.util.*;

public class Bubble_sorting {
    public static void main(String[] args) {
        int arr[] = { 5, 89, 65, 46, 6, 65, 48 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
