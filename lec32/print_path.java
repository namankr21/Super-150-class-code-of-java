package lec32;

public class print_path {
    public static void main(String[] args) {
     int n = 4;
     path(0, n, "");

    }
    public static void path(int src,int des,String ans) {
        if(src==des)
        {
            System.out.print(ans + " ");
            return;
        }
        if(src>des)
        {
            return;
        }

        path(src+1, des, ans+1);
        path(src+2, des, ans+2);
        path(src+3, des, ans+3);
    }    
}
