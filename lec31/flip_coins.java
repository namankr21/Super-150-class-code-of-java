package lec31;
public class flip_coins {
    public static void main(String[] args) {
        // String ans = "";
        int n = 3;
        printSubSeq(n, "");
        System.out.println(ConutSubSeq(n, ""));
    }
    public static void printSubSeq(int n, String ans) {
        // NO TWO H COME TOGEATHER!
        if (n== 0) {            
            // int k = ans.indexOf("HH");
            // boolean k = ans.contains("HH");
            // if(k==false)
            System.out.println(ans + " ");
            return;
        }
        // if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
        {
            printSubSeq(n-1, ans + 'H');
        }

        printSubSeq(n-1, ans + 'T');
        
    }
    public static int ConutSubSeq(int n, String ans) {
        if (n== 0) {
            
            // int k = ans.indexOf("HH");
            // boolean k = ans.contains("HH");
            // if(k==false)
            // System.out.print(ans + " ");
            return 1;
        }
        
        // if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
        
        int    a = ConutSubSeq(n-1, ans + 'H');
        

        int b = ConutSubSeq(n-1, ans + 'T');
        return a+b;
    }
}    