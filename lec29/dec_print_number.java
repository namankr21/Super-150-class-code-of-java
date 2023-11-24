package lec29;

public class dec_print_number {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        //Base Case
        if(n==0) return;
        //Recursion
        System.out.println(n);
        print(n-1);
    }

    // public static int print(int n) {
    //     //Base Case
    //     if(n==0)
    //     return 1;
    //     //Recursion
    //     System.out.println(n);
    //     print(n-1);
    //     return n-1;
    // }
    
}
