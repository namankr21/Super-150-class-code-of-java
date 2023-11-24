package lec33;

public class key_pad {
    static String key[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        String str = "352";
        keyPrint(str, "");
    }
    public static void keyPrint(String str,String ans) {
        if(str.length()==0)
        {
            System.out.print( ans +  " ");
            return;
        }
        char ch = str.charAt(0);
        String press = key[ch-'0'];
        for(int i=0;i<press.length();i++)
        {
            keyPrint(str.substring(1), ans + press.charAt(i));
        }   
    }
}