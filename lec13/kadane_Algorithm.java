package lec13;

public class kadane_Algorithm {
    public static void main(String[] args) {
        int arr[] = { 2, 1, -5, 6, -7 };
        System.out.println(findMaxSum(arr));

    }

    public static int findMaxSum(int arr[]) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = sum > ans ? sum : ans;

            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}