package lec40;
import java.util.*;
public class quick_sort {
    public static void main(String[] args) {
        int[]arr = {9,8,7,6,5,4,3,2,1,0};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr, int si, int ei) {
        if(si>=ei) return;

        int part = partition(arr, si, ei);
        quick(arr, si, part-1);
        quick(arr, part+1, ei);

    }

    public static int partition(int[]arr,int si,int ei) {
        int item = arr[ei];
        int pi = si;
        for(int i = si;i<ei;i++)
        {
            if(arr[i]<item)
            {
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }

        int temp = arr[pi];
        arr[pi] = item;
        arr[ei] = temp;

        // System.out.println(Arrays.toString(arr));
        return pi;
    }
}