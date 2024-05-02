package lec66;

public class Edit_Distance {
    public static void main(String[] args) {
        String s1 = "FOOD";
        String s2 = "MONEY";
        System.out.println(ed(s1, s2, 0, 0));
    }   
    public static int ed(String s1,String s2,int i,int j) {
        
        if(i==s1.length()) return s2.length() - j;
        if(j==s2.length()) return s1.length()-i;

        int ans = 0;

        if(s1.charAt(i)==s2.charAt(j))
        {
            ans = ed(s1, s2, i+1, j+1);
        }
        else
        {
            int dec = ed(s1, s2, i+1, j);
            int rep = ed(s1, s2, i+1, j+1);
            int inc = ed(s1, s2, i, j+1);

            ans = Math.min(inc, Math.min(dec, rep))+1;
        }

        return ans;
        
    }
}