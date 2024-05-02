package lec62;

import java.util.HashMap;
// https://leetcode.com/problems/longest-consecutive-sequence/description/
public class Longest_Consecutive {
    public static void main(String[] args) {
        int[]arr = {5,3,2,7,8,10,11,20,13,1,15,4,16,21};

        System.out.println(longestConsecutive(arr));
                   
    }

    public static int longestConsecutive(int[] arr) {

        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]-1)) map.put(arr[i],false);
            else map.put(arr[i],true);

            if(map.containsKey(arr[i]+1)) map.put(arr[i]+1,false);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            int count = 0;
            while(map.containsKey(key))
            {
                count++; key++;
            }
            ans = Math.max(ans,count);       
        }
        return ans;
    }
}
