package lec31;

public class print_subSequences {
    public static void main(String[] args) {
        String ques = "aab";
        String ans = "";
        printSubSeq(ques, ans);
    }
    // public int count = 0;
    public static void printSubSeq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans );
            // count++;
            return;
        }
        char ch = ques.charAt(0);
        printSubSeq(ques.substring(1), ans);
        printSubSeq(ques.substring(1), ans + ch);

    }
}