package lec15;
// find max x in x^k <= N;
public class findMaxXUsingBinarySearch {
    public static void main(String[] args) {
        int n = 145;
        int k = 2;
        System.out.println(kthRoot(n, k));
    }

    public static int kthRoot(int n, int k) 
    {
        int low = 1;
        int high = n;
        int ans = 0;
        while (high >= low) 
        {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, k) <= n) 
            {
                ans = mid;
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return ans;
    }
}