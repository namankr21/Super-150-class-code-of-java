package lec33;

public class permutation {
    static int count = 0;
    public static void main(String[] args) {
        String str = "abc";

        permu(str,"");
        
        System.out.println(count);

    }

    public static void permu(String str,String ans) {

        //Base Case;
        if(str.length()==0)
        {
            System.out.println(ans);
            count++;
            return;
        }

        //Recursion
        for (int i = 0; i < str.length(); i++) {
            String pre = str.substring(0, i);
            String post = str.substring(i+1);
            char ch = str.charAt(i);
            permu(pre+post, ans+ch);
        }
    }
    
}
