package lec44;

public class Dynamic_Queue_Client {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq = new Dynamic_Queue();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        dq.enqueue(50);
        dq.enqueue(60);
        dq.Display();
        dq.enqueue(70);
        dq.Display();
    }
}
