package lec36;
import java.util.*;
public class combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        boolean []arr = new boolean[n];
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        comb(arr, k, 0, li,list,0);

        System.out.println(list);

    }

    public static void comb(boolean[]arr,int k,int np,List<Integer> li,List<List<Integer>> list,int idx) {
        // Base case
        if(np==k)
        {
            list.add(new ArrayList<>(li));
            // System.out.println(li);
            return;
        }

        // Recursion
        for(int i=idx;i<arr.length;i++)
        {
            if(arr[i]==false)
            {
                arr[i] = true;
                li.add((i+1));
                comb(arr, k, np+1, li,list,i+1);
                li.remove(li.size()-1);
                arr[i] = false;
            }
        }   
    }
}
