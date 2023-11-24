package lec59;
import java.util.*;
// https://www.spoj.com/problems/BUSYMAN/
public class BusyMan {
    static class pair{
        int start;
        int end;
        pair(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();
            pair[] arr = new pair[n];

            for (int i = 0; i < arr.length; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                arr[i] = new pair(start, end);
            }

            Arrays.sort(arr,new Comparator<pair>(){
                @Override
                public int compare(pair o1, pair o2) {
                    return o1.end-o2.end;
                }
            });

            int acti = 1;
            int end = arr[0].end;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i].start>=end)
                {
                    acti++;
                    end = arr[i].end;
                }
            }

            System.out.println("ans :  "+acti);
        }

        sc.close();
    


    }
}
