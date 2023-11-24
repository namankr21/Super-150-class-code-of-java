package lec10;

// import java.util.Scanner;

public class two_pointer_approach {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr[] = { 15, 69, 44, 89, 23, -98, -5, 5 };
        // for (int i = 0; i < n; i++)
        // arr[i] = sc.nextInt();
        reverseprint1(arr);
        // sc.close();
    }

    public static void reverseprint1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int x : arr) {
            System.out.print(x + "  ");

        }

    }
}