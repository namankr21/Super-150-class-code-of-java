package lec18;

public class String_fun {
    public static void main(String[] args) {
        String s = "HelloHey";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(2, 5));
        System.out.println("no output : " + s.substring(1, 1));
        String s1 = "kunal";
        String s2 = "komal";
        System.out.println(s1.compareTo(s2));
    }
}
