package lec44;

public class My_Queue {
    protected int[] arr;
    protected int front = 0;
    private int size = 0;

    public My_Queue()
    {
        arr = new int[5];
        front = 0;
        size = 0;
   }
    public My_Queue(int n)
    {
        arr = new int[n];
        front = 0;
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return size==0;
    }

    public boolean isFull()
    {
        return size==arr.length;
    }

    public int size()
    {
        return size;
    }

    public void enqueue(int element) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue is FULL!!");
        }
        int idx = (front+size)%arr.length;
        arr[idx] = element;
        size++;
    }

    public int dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty!!");
        }
        int re = arr[front];
        size--;
        front = (front+1)%arr.length;
        return re;
    }

    public int getFront()
    {
        int re = arr[front];
        return re;
    }

    public void Display()
    {
        System.out.print("Start : ");
        for(int i=0;i<size;i++)
        {
            int idx = (front + i)%arr.length;
            System.out.print(arr[idx] + ", ");
        }

        System.out.println("End");

    }


    

    
}
