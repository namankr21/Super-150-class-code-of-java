package lec40;

public class Merge_sort {
    public static void main(String[] args) {
        int[]arr = {2,7,9,1,5,8,7,4,5,6,2,8,9};
        int[]ans = MergeSort(arr,0,arr.length-1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
    
    public static int[] MergeSort(int[]arr,int si,int ei) {
        if(si==ei) 
        {
            int []a = new int[1];
            a[0] = arr[si];
            return a;
        }
        int mid = (si+ei)/2;
        int []first = MergeSort(arr, si, mid);
        int[]sec = MergeSort(arr, mid+1, ei);

        return merge(first, sec);
        
    }
    public static int[] merge(int[]arr1,int[]arr2) {
        int ans[] = new int[(arr1.length+arr2.length)];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++] = arr1[i++];
                // i++;
                // k++;
            }
            else 
            {
                ans[k++] = arr2[j++];
                // j++;
                // k++;
            }
        }
        while(i<arr1.length)
        {
            ans[k++] = arr1[i++];
            // i++;
            // k++;
        }
        while(j<arr2.length)
        {
            ans[k++] = arr2[j++];
            // j++;
            // k++;
        }

        return ans;
    }
}