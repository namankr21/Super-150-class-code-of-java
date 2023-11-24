

public class Minimum_Falling_Path_Sum_II {
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
        if(cr==grid.length-1) 
        {
            return grid[cr][cc];
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++)
        {
            if(i!=cc)
            {
                ans = Math.min(ans,min(grid, cr+1, i));
            }
        }


        return ans + grid[cr][cc];

    }

}