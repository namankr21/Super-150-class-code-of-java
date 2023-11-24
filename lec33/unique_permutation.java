package lec33;

// import java.util.*;
public class unique_permutation {
    static int count = 0;

    public static void main(String[] args) {
        String str = "abcac";
        // ArrayList<String> li = new ArrayList<>();
        permu(str, "");

        System.out.println(count);
    }

    public static void permu(String str, String ans) {

        // Base Case;
        if (str.length() == 0) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean flag = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                String pre = str.substring(0, i);
                String post = str.substring(i + 1);
                permu(pre + post, ans + ch);
            }
        }
    }

}