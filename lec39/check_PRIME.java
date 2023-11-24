package lec39;

public class check_PRIME {
    public static void main(String[] args) {
        for(int i=10;i<50;i++)
        {
            if(isprime(i)) System.out.print(i +" ");
        }
    }

    public static boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            } 
        }
        return true;
    }
}
