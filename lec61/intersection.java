package lec61;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        
    }

    public static int[] in(int[]arr,int[]arr2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }

        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>0)
            {
                li.add(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
            }
        }

        int[]ans = new int[li.size()];
        for(int i=0;i<li.size();i++) ans[i] = li.get(i);

        return ans;

    }
}
