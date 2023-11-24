package lec18;

public class compareTo_method {
    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "rajesh";
        System.out.println(CompareTo(s1, s2));

    }

    public static int CompareTo(String s1, String s2) {
        int i = 0; // s1
        int j = 0; // s2
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j))
                return s1.charAt(i) - s2.charAt(j);
            i++;
            j++;
        }

        return s1.length() - s2.length();
    }

}
