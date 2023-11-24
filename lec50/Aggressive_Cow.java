package lec50;
import java.util.*;
public class Aggressive_Cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int[]stall = new int[nos];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(maxDistance(stall,noc));
        }
        sc.close();
    }

    private static int maxDistance(int[] stall, int noc) {
        int lo = stall[0];
        int hi = stall[stall.length-1];
        int ans = 0;
        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(isItPossible(stall,noc,mid))
            {
                ans = mid;
                lo = mid-1;
            }
            else hi = mid-1;
        }

        return ans;
    }

    private static boolean isItPossible(int[] stall, int noc, int mid) {
        int cow = 1;
        int pos = stall[0];
        for(int i = 1; i < stall.length; i++) 
        {
            if(stall[i]-pos >=mid)
            {
                cow++;
                pos = stall[i];
            }
            if(cow>=noc) return true;
        }
        return false;
    }
}
