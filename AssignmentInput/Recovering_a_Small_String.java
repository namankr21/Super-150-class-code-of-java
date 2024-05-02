package AssignmentInput;

import java.util.Scanner;

public class Recovering_a_Small_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); 
               
        while (test-->0)
        {
            int n = sc.nextInt();
            System.out.println(solve(n));    
        }

        sc.close();


    }
    public static String solve(int n)
    {

        if(n<=26)
        return "aa" + (char)((n-3)+'a');

        // int i = 3;
        // while(i>0)
        {
            // if(n>=26)

        }

        return "";
    }
}
