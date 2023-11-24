package lec46;

import lec44.Dynamic_Queue;

public class StackUsingQueue_PushEfficient {
    private Dynamic_Queue dq = new Dynamic_Queue();
    public boolean isEmpty()
    {
        return dq.isEmpty();
    }

    public int size(){
        return dq.size();
    }

    public void push(int item) throws Exception
    {
        dq.enqueue(item);
    }

    public int peek() throws Exception
    {
        Dynamic_Queue hlp = new Dynamic_Queue();
        while(dq.size()>1)
        {
            hlp.enqueue(dq.dequeue());
        }
        int x = dq.dequeue();
        while(hlp.size()>0)
        {
            dq.enqueue(hlp.dequeue());
        }
        dq.enqueue(x);
        return x;
    }
    public int pop() throws Exception
    {
        Dynamic_Queue hlp = new Dynamic_Queue();
        while(dq.size()>1)
        {
            hlp.enqueue(dq.dequeue());
        }
        int x = dq.getFront();
        while(hlp.size()>0)
        {
            dq.enqueue(hlp.dequeue());
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        StackUsingQueue_PushEfficient stpe = new StackUsingQueue_PushEfficient();
        stpe.push(1);
        stpe.push(2);
        stpe.push(3);
        stpe.push(4);
        stpe.push(5);

        System.out.println(stpe.pop());
        System.out.println(stpe.peek());
        


    }

}
