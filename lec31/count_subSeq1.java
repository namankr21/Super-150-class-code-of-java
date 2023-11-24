package lec31;

public class count_subSeq1 {
    public static void main(String[] args) {
        String ques = "AAABBC";
        String ans = "";
        printSubSeq(ques, ans);
        System.out.println(count);
        
    }
    static int count = 0;
    public static void printSubSeq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            count++;
            return;
        }
        char ch = ques.charAt(0);
        printSubSeq(ques.substring(1), ans);
        printSubSeq(ques.substring(1), ans + ch);

    }
}