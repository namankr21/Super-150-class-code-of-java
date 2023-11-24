package lec64;

public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
        System.out.println(fiboTD(n,new int[n+1]));
        System.out.println(fiboBUP(n));
    }

    private static long fiboBUP(int n) {
        // base case ko manually fill kre
        // 

        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
        
    }

    private static int fiboTD(int n, int[] dp) {
        if(n==1 || n==0) return n;

        if(dp[n]!=0)  // this id DP
        {
            return dp[n];
        }

        
        return dp[n] = fiboTD(n-1,dp) + fiboTD(n-2, dp);

    }

    private static int fibo(int n)
    {
        if (n == 1 || n == 0)
            return n;
        int f1 = fibo(n - 1);
        int f2 = fibo(n - 2);
        return f1 + f2;
    }
}
