package lec40;

public class power {
    public static void main(String[] args) {
       System.out.println(pow(2,16)); 
    }

    public static int pow(int a,int b) {
        if(b==0) return 1;
        int ans = pow(a, b/2);
        ans = ans*ans;
        if(b%2!=0) ans = ans*a;
        return ans;
    }
}
