package lec29;

public class decimal_to_binary_recursion {
    public static void main(String[] args) {
        int n = 20;
        binary(n);
    }
    public static void binary(int n) {
        if(n>0)
        {
            binary(n/2);
            System.out.print(n%2);
        }
        else return;
        
    }
}
