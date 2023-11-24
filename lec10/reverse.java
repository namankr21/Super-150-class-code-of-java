package lec10;

// import java.util.*;

public class reverse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr[] = { 15, 69, 44, 89, 23, -98, -5, 5 };
        // for (int i = 0; i < n; i++)
        // arr[i] = sc.nextInt();
        reverseprint(arr);
        // sc.close();
    }

    public static void reverseprint(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - 1 - i] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

}
