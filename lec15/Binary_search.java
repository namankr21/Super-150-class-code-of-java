package lec15;

import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10,10,10,10 ,10,10,10,16, 17, 18, 19 };
        // int len = scan.nextInt();
        // int arr[] = new int[len];
        // for(int i=0;i<len;i++)
        // arr[i] = scan.nextInt();
        int item = 10;
        scan.close();
        System.out.println(search(arr, item));
        
    }

    public static int search(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == item)
            {
                int idx = mid;
                for(int i=mid;i>=0;i--)
                {
                    if(arr[i]==item)
                    idx = i;
                }
                searchinv(arr, item, mid);
                return idx;
            }
            else if (arr[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void searchinv(int[]arr,int item,int mid) {
        int idx = mid;
        for(int i=mid;i<arr.length;i++)
        {
            if(arr[i]==item)
            idx = i;
        }
        System.out.println(idx);
    }
}