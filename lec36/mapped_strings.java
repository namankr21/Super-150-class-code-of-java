package lec36;

import java.util.*;

public class mapped_strings {
    static String arr[] = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String st = Long.toString(num);
        Mappedcode(st, "");
        sc.close();
    }

    public static void Mappedcode(String st, String ans) {
        if (st.length() == 0) {
            System.out.println(ans);
            return;
        }
        char st1 = st.charAt(0);
        int ch = st1 - '0';
        Mappedcode(st.substring(1), ans + arr[ch]);
        if (st.length() >= 2) {
            String st2 = st.substring(0, 2);
            int num = Integer.parseInt(st2);
            if (num <= 27) {
                Mappedcode(st.substring(2), ans + arr[num]);
            }
        }
    }
}