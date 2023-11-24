package lec60;
import java.util.*;
public class Kth_Largest_Element {
    public static void main(String[] args) {

        int[]arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(arr,k));
        
    }
    public static int findKthLargest(int[] arr, int k) {
        // O(N.Log(K))
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        pq.add(arr[i]);

        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]>pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

}
