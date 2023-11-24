package lec30;

public class fibonaci_recursion {
    public static void main(String[] args) {
        System.out.println(fibo(15));
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        // int f1 = fibo(n - 1);
        // int f2 = fibo(n - 2);
        return fibo(n-1) + fibo(n-2);
    }
}
