package lec22;

public class Reverse_Word_In_A_String {
    public static void main(String[] args) {
        String s = "  hello world a good   example ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\s+");
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str = str + arr[i] + " ";
        }
        return str.trim();
    }
}
