package lec19;

// import java.util.ArrayList;

public class LengthWiseSubString {
    public static void main(String[] args) {
        String str = "1234";
        PrintSubString(str);
    }

    public static void PrintSubString(String str) {

        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
        // ArrayList<String> list = new ArrayList<String>();
        // // System.out.println(list);
        // for (int len = 0; len <= str.length(); len++) {
        // for (int j = len; j <= str.length(); j++) {
        // int i = j - len;
        // list.add(str.substring(i, j));
        // }

        // }
        // System.out.println(list);
    }

}
