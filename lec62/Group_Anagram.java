package lec62;
import java.util.*;
public class Group_Anagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagram(strs));
    }

    public static List<List<String>> anagram(String[] arr) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = key(arr[i]);
            if(!map.containsKey(key))
            map.put(key,new ArrayList<>());

            map.get(key).add(arr[i]);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet())
            ans.add(map.get(key));

        return ans;
        
    }

    public static String key(String str)
    {
        int[]freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;            
        }

        StringBuilder sb = new StringBuilder();
        for(int val : freq)
        sb.append(val + " ");

        return sb.toString();
    }
    
}
