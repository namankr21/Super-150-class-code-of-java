package lec30;

public class factorial_tailRecursion 
{
    public static void main(String[] args) 
    {
        int n = 10;
        System.out.println(Rec(n,1));
    }
    public static long Rec(int n,long ans) 
    {
        if(n==0)
        return ans;
        
        return Rec(n-1, n*ans);
    }
}