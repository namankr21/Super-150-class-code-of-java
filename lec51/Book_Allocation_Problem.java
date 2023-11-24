package lec51;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        int[]page = {12,34,67,90};
        int nos = 2;

        int lo = 0;
        int hi = 0;
        for (int i : page) {
            hi+=i;
        }
        int ans = 0;

        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(isItPossible(page,nos,mid))
            {
                ans = mid;
                hi = mid-1;
            }
            else
            {
                lo = mid+1;
            }
            
        }

        System.out.println(ans);

    }

    private static boolean isItPossible(int[] page, int nos, int mid) {
        int student = 1;
        int pageRead = page[0];
        int i = 1;
        while(i<page.length)
        {
            if(page[i]+pageRead<=mid)
            {
                pageRead += page[i];
                i++;
            }
            else
            {
                student++;
                pageRead = 0;
            }
            if(student>nos) return false;
        }
        return true;
    }
}
