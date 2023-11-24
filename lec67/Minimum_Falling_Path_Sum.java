// package lec67;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        int[][]matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++)
        {
            ans = Math.min(ans,min(matrix,0,i));
        }
        System.out.println(ans);
    }   
    public static int min(int[][]grid,int cr,int cc)
    {
        if(cr>=grid.length || cc<0 || cc>=grid[0].length)
        {
            return Integer.MAX_VALUE;
        }

        if(cr==grid.length-1) 
        {
            return grid[cr][cc];
        }

        int ld = min(grid,cr+1,cc-1);
        int d = min(grid,cr+1,cc);
        int rd = min(grid,cr+1,cc+1);

        return Math.min(d,Math.min(ld,rd)) + grid[cr][cc];

    } 
}
