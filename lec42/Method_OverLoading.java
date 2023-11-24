package lec42;

public class Method_OverLoading {
    public static void main(String[] args) {
        
        System.out.println(add(5,10));
        System.out.println(add(4,8,10));
        System.out.println(add(5,10,10.5));
        System.out.println(add(1,4,5,6,9,3,2,5,6,8,9,6,7,4,8,5));
    }
    public static int add(int a,int b) 
    {
        return a+b;        
    }
    public static int add(int a,int b,int c) 
    {
        return a+b+c;        
    }
    public static int add(int a,int b,double c) 
    {
        return (int)(a+b+c);        
    }

    public static int add(int b ,int... a) 
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) 
        {
            sum+=a[i];
        }
        System.out.println("b " + b);
        return sum;
    }
}