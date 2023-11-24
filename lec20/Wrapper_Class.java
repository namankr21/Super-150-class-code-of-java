package lec20;

public class Wrapper_Class {
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;

        System.out.println(a);
        System.out.println(a1);

        a = a1; // when we do premetive into non-premetive called AutoBoxing

        Integer c1 = 10;
        Integer c2 = 10;
        Integer c3 = 178;
        Integer c4 = 178;
        System.out.println(c1 == c2); // true
        System.out.println(c3 == c4); // false
        // as values of c1 and c2 are in b/w -128 to 127
        // so there is no duplicate address of these number
    }
}
