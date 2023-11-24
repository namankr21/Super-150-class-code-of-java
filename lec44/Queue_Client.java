package lec44;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        My_Queue que = new My_Queue();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.Display();
        System.out.println("Removed Element : " + que.dequeue());
        System.out.println("Removed Element : " + que.dequeue());
        System.out.println("Removed Element : " + que.dequeue());
        que.enqueue(50);
        que.enqueue(60);
        que.enqueue(70);
        que.enqueue(80);
        que.Display();
        System.out.println("Removed Element : " + que.dequeue());
        System.out.println("Removed Element : " + que.dequeue());
        System.out.println("Removed Element : " + que.dequeue());
        que.Display();
        System.out.println(que.getFront());

    }
}
