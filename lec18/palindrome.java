package lec18;

public class palindrome {
    public static void main(String[] args) {
        String s = "naman";
        System.out.println(String_Palindrome(s));
    }

    public static boolean String_Palindrome(String s) {
        boolean flag = true;
        int n = s.length();
        int i = 0;
        int j = n - 1;
        // USING TWO POINTER APPROACH
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                return flag;
            }
            i++;
            j--;
        }

        return flag;

    }
}

// USING FOR LOOP
// boolean flag = true;
// int n = s.length();
// for (int i = 0; i < n / 2; i++) {
// if (s.charAt(i) != s.charAt(n - 1 - i)) {
// flag = false;
// return flag;
// }
// }
// return flag;