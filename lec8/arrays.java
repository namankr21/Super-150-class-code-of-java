package lec8;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("len is " + arr.length);
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);

        sc.close();
    }

    public static void display(int[] arr) {
        System.out.print("Array is  ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

}