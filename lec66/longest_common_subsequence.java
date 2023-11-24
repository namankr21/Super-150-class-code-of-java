package lec66;
import java.util.*;
public class longest_common_subsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        // System.out.println(lcs(s1, s2, 0, 0));(
        int[][]dp = new int[s1.length()][s2.length()];
        for(int[]ar : dp)
        Arrays.fill(ar,-1);
        System.out.println(lcs(s1, s2, 0, 0, dp));

    }
    public static int  lcs(String s1,String s2,int i,int j,int[][]dp) {
        if(i==s1.length() || j==s2.length()) return 0;

        int ans = 0;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans = 1 + lcs(s1, s2, i+1, j+1);
        }
        else
        {
            int fs = lcs(s1, s2, i+1, j);
            int ss = lcs(s1, s2, i, j+1);
            ans = Math.max(fs,ss);
        }

        return dp[i][j] =  ans;
    }
    public static int  lcs(String s1,String s2,int i,int j) {
        
        if(i==s1.length() || j==s2.length()) return 0;

        int ans = 0;
        if(s1.charAt(i)==s2.charAt(j))
        {
            ans = 1 + lcs(s1, s2, i+1, j+1);
        }
        else
        {
            int fs = lcs(s1, s2, i+1, j);
            int ss = lcs(s1, s2, i, j+1);
            ans = Math.max(fs,ss);
        }

        return ans;

    }
}