package lec12;

import java.util.Arrays;

public class selection_sorting {
    public static void main(String[] args) {
        int arr[] = { 45, 98, 65, 8, 15, 6545, 154, 54, 00, 54, 4, 54, 4, 1, 445, 84, 51, 654, 58 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mini = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini])
                    mini = j;
            }
            // Swapping
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

    }

}
