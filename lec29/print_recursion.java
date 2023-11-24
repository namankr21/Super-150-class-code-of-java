package lec29;

public class print_recursion {
    public static void main(String[] args) {
        int n = 5;
        printf(n);
    }
    public static void printf(int n) {
        //Base Case
        if(n==0)
        {
            return;
        }
        //Recursion
        printf(n-1);
        System.out.println(n);
    }
}
