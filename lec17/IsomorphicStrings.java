package lec17;

import java.util.Arrays;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "bbbaaaba", t = "aaabbbba";
        System.out.println(isomorphic(s, t));

    }

    public static boolean isomorphic(String s, String t) {
        int n = s.length();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < n; i++) {
            freq1[s.charAt(i) - 97]++;
            freq2[t.charAt(i) - 97]++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        int num = 0;
        boolean flag = true;
        for (int i = 25; i > 25 - n; i--) {
            System.out.println("f1 : " + freq1[i] + " f2 : " + freq2[i]);
            if (freq1[i] == freq2[i]) {
                num = num + 1;

            } else {
                flag = false;
                break;
            }
        }

        return flag;

    }
}
