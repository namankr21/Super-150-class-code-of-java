package lec26;
import java.util.*;
public class StringStringCompression {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        scan.close();
        String str2 = "";
        int count = 1;
        int n = str1.length();

        for(int i=1;i<n;i++)
        {
            if(str1.charAt(i-1) != str1.charAt(i))
            {
                str2 += str1.charAt(i-1);
                if(count!=1)
                str2 += Integer.toString(count);
                count = 1;
            }
            else
            {
                count++;
            }
        }
        if(str1.charAt(n-2)==str1.charAt(n-1))
        {
            str2 += str1.charAt(n-1);
            if(count!=1)
            str2 += Integer.toString(count);            
        }
        else 
        {
            str2 += str1.charAt(n-1);
            if(count!=1)
            str2 += Integer.toString(1);
        }
        System.out.println(str2);




    }
}