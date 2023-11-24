package lec36;
import java.util.*;
public class palindrome_partitioning {
    public static void main(String[] args) {
        String str = "naman";
        List<String> ll = new ArrayList<>(); 
        List<List<String>> list = new ArrayList<>();
        partition(str, ll,list);

        System.out.println(list);

    }

    public static void partition(String que, List<String> ll,List<List<String>> list) {
        if (que.length() == 0) {
            
            // System.out.println(ll);
            List<String> newll = new ArrayList<>(ll);
            list.add(newll);
            // System.out.println(ans);
            return;
        }

        for (int i = 1; i <= que.length(); i++) {
            String part = que.substring(0, i);
            if(ispalindrome(part))
            {
                ll.add(part);
                partition(que.substring(i), ll,list);
                ll.remove(ll.size()-1);
                // ll.clear(); //this is also true but at some cases
            }
        }

    }

    public static boolean ispalindrome(String part) 
    {
        int i=0;
        int j = part.length()-1;
        while(i<j)
        {
            if(part.charAt(i)!=part.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }

}
