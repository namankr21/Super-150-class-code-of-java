package lec38;

public class nqueensolution {
    public static void main(String[] args) {
        int n = 4;
        nqueen(new boolean[n][n], 0, n);

    }
    public static void nqueen(boolean[][]board,int row,int nq) {
        if(nq==0)
        {
            display(board);
            System.out.println();
            return;
        }

        for(int i=0;i<board.length;i++)
        {
            if(issafe(board,row,i)==true)
            {
                board[row][i] = true;
                nqueen(board, row+1, nq-1);
                board[row][i] = false;
            }
        }

        
    }
    public static void display(boolean[][]board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j])
                System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        
    }
    public static boolean issafe(boolean[][]board,int row,int col) {
        int r = row;
        int c = col;
        // upside
        while(r>=0)
        {
            if(board[r][col]) return false;
            r--;
        }
        // right diagonal
        r = row;
        while(c<board.length&&r>=0)
        {
            if(board[r][c]) return false;
            c++;
            r--;
        }

        // left diagonal
        r = row;
        c = col;
        while(c>=0&&r>=0) 
        {
            if(board[r][c]) return false;
            c--;
            r--;
        }

        return true;
    }
}
