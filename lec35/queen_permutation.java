package lec35;

public class queen_permutation {
    public static void main(String[] args) {
        boolean[]board = new boolean[4];
        queen(board, 3, 0, "");
    }

    public static void queen(boolean[]board,int tq,int qpsf,String ans) {
        // tq - total queens
        // qpsf - queen placed so far
        // Base case 
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i] = true;
                queen(board,tq,qpsf+1,ans+"b" + i +"q"+ qpsf + " ");
                board[i] = false;

            }
        }
    }
}
