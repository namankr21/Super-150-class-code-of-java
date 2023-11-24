package lec26;

public class Min_Window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(MinWindow(s, t));

    }

    public static String MinWindow(String s, String t) {
        int freq1[] = new int[123];
        int freq2[] = new int[123];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freq1[ch]++;
        }
        int si = 0;
        int ei = 0;
        int start = -1;
        int len = Integer.MAX_VALUE;
        int count = 0;
        while (ei < s.length()) {
            // grow
            char ch = s.charAt(ei);
            freq2[ch]++;
            if (freq1[ch] >= freq2[ch]) {
                count++;
            }
            // shrink
            if (count == t.length()) {
                while (freq2[s.charAt(si)] > freq1[s.charAt(si)] && si <= ei) {
                    freq2[s.charAt(si)]--;
                    si++;
                } 

                // ans
                if (len > (ei - si + 1)) {
                    len = (ei - si + 1);
                    start = si;
                }
            }
            ei++;
        }

        if (start == -1)
            return "";

        return s.substring(start, len + start);

    }
}
