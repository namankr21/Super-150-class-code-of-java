package lec52;

import java.util.*;

public class only_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]ladder = makeladders(n);
        // System.out.println(Arrays.toString(ladder));
        System.out.println("\n"+path(n,0,ladder,""));
        sc.close();
    }

    private static int path(int n, int cc, int[] ladder, String ans) {
        if(cc==n)
        {
            System.out.print(ans + "END , ");
            return 1;
        }
        if(cc>n)
        {
            return 0;
        }
        int count  = 0;
        if(ladder[cc]!=0)
        {
            count+=path(n, ladder[cc], ladder, ans+cc+" ");
            return count;
        }    
        for(int dice = 1;dice<=6;dice++)
        {
            count+=path(n, cc+dice, ladder, ans+cc+" ");
        }

        return count;
    }

    public static int[] makeladders(int n)
    {
        boolean[]prime = makeprime(n);
        int[]ladder = new int[n+1];
        int i=0;
        int j=prime.length-1;
        while(j>i)
        {
            while(i<prime.length&&prime[i])
            i++;

            while(j>=0&&prime[j])
            j--;

            if(j>i)
            {
                ladder[i] = j;
                i++;
                j--;
            }
        }


        return ladder;
    }

    public static boolean[] makeprime(int n)
    {
        boolean[]ans = new boolean[n+1];
        ans[0] = ans[1] = true;
        for(int i=2;i*i<ans.length;i++)
        {
            if(ans[i]==false)
            for(int k = 2;i*k<ans.length;k++)
            {
                ans[i*k] = true;
            }
        }

        return ans;
    }
    


}
