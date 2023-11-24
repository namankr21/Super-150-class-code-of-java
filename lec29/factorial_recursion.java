package lec29;

public class factorial_recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        //BASE CASE
        if(n==1) return 1;

        int fn = factorial(n-1);
        return n*fn ;
        
    }
}
