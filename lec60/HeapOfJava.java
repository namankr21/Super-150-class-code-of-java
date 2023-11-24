package lec60;
import java.util.*;
public class HeapOfJava {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        pq.add(5);
        pq.add(7);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        pq.add(9);
        pq.add(3);

        System.out.println(pq);


    }
    
}
