package lec39;
// Axis - Orbit Algo.
public class palindrome_substring {
    public static void main(String[] args) {
        System.out.println(count("naman"));
    }
    public static int count(String s) {
        int count = 0;
        // ODD number count
        for (int axis = 0; axis < s.length(); axis++) 
        {
            for (int orbit = 0; axis-orbit>=0&&axis+orbit < s.length(); orbit++)
            {
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) break;
                else count++;
            }
            
        }

        // EVEN number count.
        for(double axis=0.5;axis<s.length();axis++)
        {
            for(double orbit=0.5;axis+orbit<s.length()&&axis-orbit>=0;orbit++)
            {
                if(s.charAt((int)(axis+orbit))!=s.charAt((int)(axis-orbit))) break;
                else count++;
            }
        }
        
        return count;
    }
}
