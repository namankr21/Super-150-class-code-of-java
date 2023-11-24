package lec65;
// import java.util.*;
public class coin_change_ii {
    public static void main(String[] args) {
        int[] coin = { 1, 2, 3 };
        int amount = 4;
        // int ans = change(coin, amount, 0);
        // System.out.println(ans);
        // int[][]dp = new int[amount+1][coin.length];
        // for (int index = 0; index < dp.length; index++) {
        //    for (int i = 0; i < dp.length; i++) {
        //     dp[index][i] = -1;
        //    }
        // }
        // System.out.println(change(coin, amount, ans, dp));
        System.out.println(changeBU(coin, amount));
    }

    public static int changeBU(int[]coin,int amount) {
        int[][] dp = new int[amount+1][coin.length+1];

        for(int i=0;i<dp[0].length;i++)
        dp[0][i] = 1;

        for(int amt=1;amt<dp.length;amt++)
        {
            for (int i = 1; i < dp[0].length; i++) {
                int inc=0,exc=0;
                if(amt>=coin[i-1])
                {
                    inc = dp[amt-coin[i-1]][i];
                }
                exc = dp[amt][i-1];

                dp[amt][i] = inc+exc;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static int change(int[] coin, int amount, int i) {
        if (amount == 0) {
            return 1;
        }
        if (i == coin.length) {
            return 0;
        }

        int inc = 0, exc = 0;

        if (amount >= coin[i]) {
            inc = change(coin, amount - coin[i], i);
        }

        exc = change(coin, amount, i + 1);

        return inc + exc;
    }
    public static int change(int[] coin, int amount, int i,int[][]dp) {

        if (amount == 0) {
            return 1;
        }
        if (i == coin.length) {
            return 0;
        }

        int inc = 0, exc = 0;

        if(dp[amount][i] != -1)
        return dp[amount][i];

        if (amount >= coin[i]) {
            inc = change(coin, amount - coin[i], i);
        }

        exc = change(coin, amount, i + 1);

        return dp[amount][i] =  inc + exc;
    }
}
