package lec45;
import lec44.Dynamic_Queue;
public class Reverse_Queue extends Dynamic_Queue{
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq = new Dynamic_Queue();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        dq.Display();
        reverse(dq);
        dq.Display();
    }

    public static void reverse(Dynamic_Queue dq) throws Exception {
        if(dq.isEmpty()) return;
        int k = dq.dequeue();
        reverse(dq);
        dq.enqueue(k);
    }
}