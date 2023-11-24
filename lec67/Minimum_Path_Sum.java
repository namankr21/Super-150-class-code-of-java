// package lec67;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(min(grid, 0, 0));
        
    }   
    public static int min(int[][]grid,int i,int j)
    {
        if(i==grid.length-1 && j==grid[0].length-1)
        return grid[i][j];

        if(i>=grid.length || j>=grid[0].length) 
        {
            return Integer.MAX_VALUE;
        }

        int h = min(grid,i,j+1);
        int v = min(grid,i+1,j);

        return Math.min(h,v) + grid[i][j];

    } 
}