package lec37;

public class combination_que {
    public static void main(String[] args) {
        int n = 2;
        com("abcd", "", n);
    }

    public static void com(String que, String ans, int n) {
        if (ans.length() == n) {
            System.out.print(ans + " ");
            return;
        }

        if (que.isEmpty())
            return;

        String rem = que.substring(1);
        char ch = que.charAt(0);
        com(rem, ans + ch, n);
        com(rem, ans, n);
    }
}
