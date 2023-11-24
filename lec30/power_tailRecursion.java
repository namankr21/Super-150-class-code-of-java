package lec30;

public class power_tailRecursion {
    public static void main(String[] args) {
        int num = 2;
        int power = 10;
        System.out.println(pow(num,power,1));
    }

    public static int pow(int num,int power,int ans) {
        //Base Case
        if(power==0)
        return ans;
        return pow(num,power-1,ans*num);
    }
}