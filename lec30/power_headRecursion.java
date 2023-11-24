package lec30;

public class power_headRecursion {
    public static void main(String[] args) {
        int num = 4;
        int power = 7;
        System.out.println(powers(num,power));
    }
    public static int powers(int num,int power) {
        //Base Case 
        if(power==0)
        return 1;
        //Recursion 
        int ans = powers(num, --power);
        return num*ans;
        
    }
}
