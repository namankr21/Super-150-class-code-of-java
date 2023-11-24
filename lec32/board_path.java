package lec32;

public class board_path {

    public static void main(String[] args) {
        int n = 5;
        PrintPath(0, n, "");
    }

    public static void PrintPath(int src, int des, String ans) {
        if (src == des) {
            System.out.print(ans + " ");
            return;
        }
        if (src > des) {
            return;
        }

        // PrintPath(src+1, des, ans+1);
        // PrintPath(src+2, des, ans+2);
        // PrintPath(src+3, des, ans+3);
        for (int dice = 1; dice <= 6; dice++) {
            PrintPath(src + dice, des, ans + dice);
        }
    }
    // public static void printstep(int n, String ans, int des) {
    // if (n>=0) {
    // int sum = 0;
    // int k = Integer.parseInt(ans);
    // while (k >= 0) {
    // sum += k % 10;
    // k /= 10;
    // }
    // if (sum == des) {
    // System.out.println(ans);
    // // return;
    // }
    // return;
    // }
    // printstep(n - 1, ans + 1, des);
    // printstep(n - 1, ans + 2, des);
    // printstep(n - 1, ans + 3, des);
    // }
}
