package lec44;
public class Dynamic_Queue extends My_Queue{
    @Override
    public void enqueue(int element) throws Exception
    {
        if(super.isFull())
        {
            int[]arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++)
            {
                int idx = (front+i)%arr.length;
                arr2[i] = arr[idx]; 
            }
            front = 0;
            arr = arr2;
        }
        super.enqueue(element);
    }
}



