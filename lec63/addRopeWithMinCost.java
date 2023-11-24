package lec63;
import java.util.*;
public class addRopeWithMinCost {
    public static void main(String[] args) {
        int[]arr = {2,3,1,4,5};
        // int[]arr={2,3,4,1,5,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr) {
            pq.add(val);
        }
        int sum = 0;
        while(pq.size()>1)
        {
            int a = pq.poll();
            int b = pq.poll();
            sum+=a+b;
            pq.add(a+b);
        }

        System.out.println(sum);
    }
    
}
