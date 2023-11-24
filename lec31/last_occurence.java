package lec31;

public class last_occurence {
    public static void main(String[] args) {
        int arr[] = {2,3,7,1,2,5,7,9,0,8};
        int item = 7;
        find(arr,item,arr.length-1);
    }
    public static void find(int[]arr,int item,int i) {
        //Base Case
        if(i==-1)
        {
            return;
        }
        if(arr[i]==item)
        {
            System.out.println(i);
            return;
        }
        find(arr, item, i-1);
        
    }
}
