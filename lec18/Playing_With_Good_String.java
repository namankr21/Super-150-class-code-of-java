package lec18;

import java.util.*;

//  A STRING IS GOOD IF IT CONTAINS ONLY VOVELS
//  HERE WE RETURN LONGEST GOOD STRING 
public class Playing_With_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(good(s));
    }

    public static String good(String s) {
        int j = 0;
        int n = s.length();
        String str = "";
        String str2 = "";
        while (j < n) {
            char c = s.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                str += c;
                j++;
                if (str2.length() <= str.length())
                    str2 = str;
            } else {
                str = "";
                j++;
            }

        }
        return str2;

    }
}
