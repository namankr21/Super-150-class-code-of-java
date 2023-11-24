package lec68;

public class wine {
    public static void main(String[] args) {
        int[]wine = {2,3,5,1,4};
        System.out.println(maxprof(wine, 0, wine.length-1,1));
        System.out.println(maxprofbu(wine));
    }   
    
    private static int maxprofbu(int[] wine) {
        int year = wine.length;
        int[][]dp = new int[wine.length][wine.length];
        for (int i = 0; i < wine.length; i++) {
            dp[i][i] = wine[i]*year;
        }
        year--;

        for (int slide = 0; slide < dp.length; slide++) {
            for (int j = slide; j < dp.length; j++) {
                int i = j-slide;
                int f = wine[i]*year + dp[i+1][j];
                int l = wine[j]*year + dp[i][j-1];

                dp[i][j] = Math.max(f,l);
            }

            year--;

        }
        
        return 0;
    }

    public static int maxprof(int[]wine,int i,int j,int year) {

        if(i>j) 
        {
            return 0;
        }

        int f = wine[i]*year + maxprof(wine, i+1, j, year+1);
        int l = wine[j]*year + maxprof(wine, i, j-1, year+1);

        return Math.max(f,l);
        
    }
}