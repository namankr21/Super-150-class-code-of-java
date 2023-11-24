package lec35;

public class queen_combination {
    public static void main(String[] args) {
        int n = 4;
        boolean [] arr = new boolean[n];
        int nq = 3;
        queencombination(arr,nq,0,"",0);
    }
    public static void queencombination(boolean[] board,int tq,int qpsf,String ans,int idx)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
            return;
        }

        for(int i=idx;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i] = true;
                queencombination(board, tq, qpsf+1, ans+"b" + i+ "q" + qpsf + " ", i+1);
                board[i] = false;
            }
        }
    }
}
