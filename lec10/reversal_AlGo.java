package lec10;

public class reversal_AlGo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 100;
        k = k % n;

        reverseprint1(arr, 0, n - k - 1);
    }
    public static void reverseprint1(int[] arr, int i, int j) {
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