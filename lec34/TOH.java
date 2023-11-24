package lec34;
import java.util.*;
public class TOH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        toh(num,"A","C","B");

    }

    public static void toh(int n,String s,String h,String d)
    {
        if(n==0)
        return;

        toh(n-1,s,d,h);
        
        System.out.println("Moving ring " + n +" from " + s +" to " + d);
        
        toh(n-1,h,s,d);
    }
}