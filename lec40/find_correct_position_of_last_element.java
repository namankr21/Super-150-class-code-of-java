package lec40;
import java.util.*;
public class find_correct_position_of_last_element {
    public static void main(String[] args) {
        int[]arr = {5,7,2,3,8,9,1,4};
        System.out.println(partition(arr, 0, arr.length-1));
    }
    public static int partition(int[]arr,int si,int ei) {
        int item = arr[ei];
        int pi = 0;
        for(si=0;si<arr.length-1;si++)
        {
            if(arr[si]<item)
            {
                int temp = arr[si];
                arr[si] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }

        int temp = arr[pi];
        arr[pi] = item;
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
        return pi;
    }
}
