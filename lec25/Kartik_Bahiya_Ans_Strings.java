package lec25;
// LC : 2024. Maximize the Confusion of an Exam
public class Kartik_Bahiya_Ans_Strings {
    public static void main(String[] args) {
        String str = "aaabababbababaaaaaab";
        int k = 2;
        int fa = flips(str, k, 'a');
        int fb = flips(str, k, 'b');
        System.out.println(Math.max(fa, fb));
    }
    public static int flips(String str,int k,char ch) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int f = 0;

        while(ei<str.length())
        {
            // Growing
            if(str.charAt(ei)==ch)
            {
                f++;
                
            }
            // Shrinking
            while(si<=ei && f>k)
            {
                if(str.charAt(si)==ch)
                {
                    f--;
                }
                si++;
            }
            // Ans Update
            ans = Math.max(ans, ei-si+1);
            ei++;
        }


        return ans;
        
    }
}
