package lec29;
public class sum_of_digits_of_number_recursion {
    public static void main(String[] args) {
        int n = 50;
        sum(n, 0);
    }

    public static void sum(int n, int ans) {
        if (n > 0) {
            sum(n / 10, ans + n % 10);
        } 
        else {
            System.out.println(ans);
            return;
        }
    }
}