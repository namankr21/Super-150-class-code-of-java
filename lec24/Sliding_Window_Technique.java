package lec24;

public class Sliding_Window_Technique {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        int k = 3;
        System.out.println(slide(arr, k));
    }

    public static int slide(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = k;
        int sum = 0;
        int st = 0;
        for (int l = 0; l < k; l++) {
            sum += arr[l];
        }
        int ans = sum;
        while (j < n) {
            sum = sum + arr[j] - arr[i];
            if (sum > ans)
                {ans = sum;
                st = i+1;}
            j++;
            i++;
        }
        System.out.println(st);
        // for(int i = k;i<arr.length;i++)
        // {
        //     sum += arr[i];
        //     sum -= arr[i-k];
        //     ans = Math.max(sum,ans);
        // }

        return ans;
    }
}
