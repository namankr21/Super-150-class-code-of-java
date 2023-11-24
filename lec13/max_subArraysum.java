package lec13;

public class max_subArraysum {
    public static void main(String[] args) {
        int arr[] = { 2, 1, -5, 6, -7 };
        int n = arr.length;
        int subsum =0;
        int ans =  Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++)
         
            for (int j = 0; j < n; j++) {
                subsum += arr[j];
            ans = Math.max(ans, subsum);
            if (subsum<0) {
                
                subsum = 0;
            }
        }
        System.out.println(ans);
    }
}