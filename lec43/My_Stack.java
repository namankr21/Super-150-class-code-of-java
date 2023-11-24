package lec43;

public class My_Stack {
    protected int[] arr;
    int tos;

    public My_Stack()
    {
        arr = new int[50];
        tos = -1;
    }
    public My_Stack(int n)
    {
        arr = new int[n];
        tos = -1;
    }

    public boolean isEmpty()
    {
        return tos==-1;
    }

    public boolean isFull()
    {
        return tos==arr.length-1;
    }

    public void push(int element) throws Exception
    {
        if(isFull())
        {
            throw new Exception("STACK is FULL!!");
        }
        tos++;
        arr[tos] = element;
    }

    public int size()
    {
        return tos+1;
    }

    public int pop()
    {
        int x = arr[tos];
        tos--;
        return x;
    }

    public int peek() throws Exception
    {
        if(isEmpty()) throw new Exception("STACK is EMPTY!!");
        return arr[tos];
    }

    public void display()
    {
        for(int i=0;i<=tos;i++)
        {
            System.out.print(arr[i]);
            if(i!=tos)
            System.out.print(" -> ");
        }
        System.out.println(".");
    }
}
