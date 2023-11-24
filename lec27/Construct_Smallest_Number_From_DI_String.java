package lec27;

import java.util.Arrays;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String str = "D";
        smallNumber(str);
    }

    public static void smallNumber(String str) {
        int []arr = new int[str.length()+1];
        int count = 1;
        for (int i = 0; i <= str.length(); i++) {
            if(i==str.length()||str.charAt(i)=='I')
            {
                arr[i] = count;
                count++;
                for (int j = i-1;j>=0 && str.charAt(j)!='I' ; j--) {
                    arr[j] = count;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
