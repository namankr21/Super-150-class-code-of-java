package lec44;

import lec43.My_Stack;
// Deafult ka scope within package hota h!!
// public ka anywhere
// private ka scope within class
// protected ka scope within package hota h!! but can be inherit
public class Dynamic_Stack extends My_Stack{
    @Override
    public void push(int item) throws Exception
    {
        if(this.isFull()) 
        //we can also write super.isFull() but we dont have a conflict of same method name
        {
            int[]arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++)
            {
                arr2[i] = arr[i];
            }
            arr = arr2;
            // Garbage collector apne aap purane wale array ko 
            // le jayga jab yeh kisi ko point nhi krega jab
        } 
        super.push(item);
        //use super to use Parent class method as conflict : same method name in the child class
        
    }
}
