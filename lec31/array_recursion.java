package lec31;

public class array_recursion {
    public static void main(String[] args) {
        int arr[] = {2,3,7,1,2,5,7,9,0,7};
        int item = 7;
        find(arr,item,0);
    }
    public static void find(int[] arr,int item,int i) {
        //base case
        if(i==arr.length)
        {
            // System.out.println("NOT Found");
            return;
        }
        //Recursion
        if(arr[i]==item)
        {
            System.out.println("Got " + arr[i] + " at Index : " + i);
            // return;
        }
        
        find(arr, item, i+1);
        
    }
    
}