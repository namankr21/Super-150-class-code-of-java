package lec24;

public class Product_Less_ThanK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 2 };
        int k = 10;
        System.out.println(count(arr, k));

    }

    public static int count(int[] arr, int k) {
        int ans = 0;
        int si = 0, ei = 0;
        int p = 1;
        while (ei < arr.length) {
            p *= arr[ei]; // window grow

            while (p >= k && si <= ei) // window shrink
            {
                p /= arr[si];
                si++;
            }

            ans += (ei - si + 1);
            ei++;

        }

        return ans;

    }
}
