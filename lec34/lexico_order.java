package lec34;

public class lexico_order {
    public static void main(String[] args) {
        int n = 150;
        lexo_print(0, n);
    }

    public static void lexo_print(int ans, int n) {
        // Base Case
        if (ans > n) {
            return;
        }
        // Recursion
        System.out.print(ans + " ");
        int i = 0;
        if (ans == 0) {
            i = 1;
        }
        for (; i < 10; i++) {
            lexo_print(ans * 10 + i, n);
        }
    }
}