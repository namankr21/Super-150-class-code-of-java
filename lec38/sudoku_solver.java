package lec38;

public class sudoku_solver {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        solve(grid, 0, 0);
    }

    public static void solve(int[][]board,int row,int col) {
        if(col==9)
        {
            row++;
            col=0;
        }
        if(row==9)
        {
            display(board);
            return;
        }
        if(board[row][col]!=0)
        solve(board, row, col+1);
        else
        {
            for (int val = 1; val <=9 ; val++) 
            {
                if(issafe(board, row, col, val))
                {
                    board[row][col] = val;
                    solve(board, row, col+1);
                    board[row][col] = 0;
                }
            }
        }
        
    }
    public static void display(int[][]grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j = 0;j<grid.length;j++ )
            System.out.print(grid[i][j] + " ");

            System.out.println();
        }
        
    }
    public static boolean issafe(int[][]board,int row,int col,int val) {
        // checkinh in whole column
        for(int r = 0;r<board.length;r++)
        {
            if(board[r][col]==val) return false;
        }

        // checking in whole row
        for(int c = 0;c<board.length;c++)
        {
            if(board[row][c]==val) return false;
        }

        // Checking in 3X3 Matrix

        int r = row-row%3;
        int c = col-col%3;
        for(int i=r;i<r+3;i++)
        {
            for (int j = c; j < c+3; j++) 
            {
                if(board[i][j]==val) return false;    
            }
        }


        return true;
    }
}
