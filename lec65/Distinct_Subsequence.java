package lec65;

public class Distinct_Subsequence {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";

        System.out.println(Distinct(s, t, 0, 0));
        
    }
    // s1 : coin
    // t1 : amount
    // i s1 index
    // j t1 index
    public static int Distinct(String s1,String t1,int i,int j) 
    {
        if(t1.length()==j) return 1;
        if(s1.length()==i) return 0;

        int inc = 0,exc = 0;

        if(s1.charAt(i)==t1.charAt(j))
        {
            inc = Distinct(s1, t1, i+1, j+1);
        }

        exc = Distinct(s1, t1, i+1, j);

        return inc + exc;

    }
    
}
