package lec8;
public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, 5, 6, 7, -8, 99 };
        System.out.println(arr[0] + " " + arr[5]);
        aswap(arr, 0, 5);
        System.out.println(arr[0] + " " + arr[5]);
        arrays.display(arr);
    }
    public static void aswap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
