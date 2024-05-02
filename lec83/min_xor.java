package lec83;

public class min_xor {
    public static void main(String[] args) {
        int a = 11;
        int b = 125;

        System.out.println(min_val(a, b));

    }

    public static int min_val(int a,int b)
    {
        int c = countSetBit(b);
        int x = 0;

        for (int i = 31; i>=0 && c>0; i--) {
            if((a & (1<<i))!=0)
            {
                x+=(1<<i);
                c--;
            }
        }

        for (int i = 0; i < 31 && c>0 ; i++) {
            if((a & (1<<i))==0)
            {
                x+=(1<<i);
                c--;
            }
        }

        return x;

    }

    public static int countSetBit(int b)
    {
        int count = 0;

        while(b!=0)
        {
            count++;
            b = (b & (b-1));
        }

        return count;

    }




}
