package lec40;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,8,9,90,99};
        int[]arr2 = {1,3,5,7,11,13,87,91,92,94,99};
        
        int[]ans = merge(arr1, arr2);
        for (int k2 = 0; k2 < ans.length; k2++) {
            System.out.print(ans[k2] + " ");
        }
    
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