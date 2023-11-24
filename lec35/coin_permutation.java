package lec35;
public class coin_permutation {
    public static void main(String[] args) {
        int arr[] = { 1,2,5 };
        int sum = 5;
        count(arr, sum, "", 0);

    }
    public static void count(int[] arr, int sum, String ans, int n) {
        // Base case1
        if (n == sum) {
            System.out.print(ans + " - ");
            return;
        }
        // Base case2
        if (n > sum)
            return;

        // Recursion
        for (int i = 0; i < arr.length; i++) {
            count(arr, sum, ans + arr[i] + " ", n + arr[i]);
        }
    }
}