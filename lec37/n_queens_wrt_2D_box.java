package lec37;

public class n_queens_wrt_2D_box {
    public static void main(String[] args) {
        com_2d(0, 0, 3, "", 3, 4,new boolean[3][4]);
    }

    public static void com_2d(int row,int col,int qtp,String path,int trow,int tcol,boolean[][]board) {
        // Base Case
        if(qtp==0)
        {
            System.out.println(path + " ");
            return;
        }
               
        if(col==tcol)
        {
            col=0;
            row++;
        }

        if(row==trow)
        return;    

        // Recursion
        if(isSafe(row,col,board))
        {
            board[row][col] = true;
            com_2d(row, col+1, qtp-1, path+"Q{" + row+","+col+"}", trow, tcol,board);
            board[row][col] = false;
        }
        com_2d(row, col+1, qtp, path, trow, tcol,board);
    }

    public static boolean isSafe(int r,int c,boolean[][]board) {
        for (int row = r; row>=0; row--) {
            if(board[row][c])
            return false;
        }

        for (int col = 0; col<c; col++) {
            if(board[r][col])
            return false;
        }

        int r1 = r;
        int c1 = c;
        while(r1>=0&&c1>=0)
        {
            if(board[r1][c1])
            return false;
            r1--;
            c1--;
        }

        int r2 = r;
        int c2 = c;
        while(r2>=0&&c2<board[0].length)
        {
            if(board[r2][c2])
            return false;
            r2--;
            c2++;
        }
        return true;
    }
}