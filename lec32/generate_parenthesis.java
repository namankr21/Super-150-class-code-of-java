package lec32;

import java.util.*;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<String> li = new ArrayList<String>();
        create(n, "", 0, 0, li);
        System.out.println(li);
    }

    public static void create(int n,String ans,int open, int close,ArrayList<String> li)
    {
        if(open==n&&close==n)
        {
            // System.out.print(ans + " ");
            li.add(ans);
            return;
        }
        if(open<n)
        {
            create(n,ans + "{",open + 1,close,li);
        }
        if(close<open)
        {
            create(n,ans + "}",open,close + 1,li);
        }
    }
}
