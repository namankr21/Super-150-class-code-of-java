package lec33;

public class Maze_path {
    static int k = 0;
    public static void main(String[] args) {
        // int[][]arr = new int[3][3];
        int n = 3;
        int m = 4;
        path(n,m, 0, 0, "");
        System.out.println(k);
    }
    public static void path(int n,int m,int i,int j,String ans) {
        //Base Case;
        if(i==n-1 && j==m-1)
        {
            System.out.println(ans + " ");
            k++;
            return;
        }
        //Row++;
        if(i<n)
        path(n,m, i+1, j, ans + 'V');
        //Col++;
        if(j<m)
        path(n,m,i, j+1, ans + 'H');
        
        
    }
}
