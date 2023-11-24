package lec4;


import java.util.*;

public class gradeCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num >= 75)
            System.out.println("A");
        else if (num >= 65)
            System.out.println("B");
        else if (num >= 55)
            System.out.println("C");
        else if (num >= 45)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        scan.close();
    }
}