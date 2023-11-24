package lec42;

public class Client {
    public static void main(String[] args) {
        // // Case 1
        // P obj1 = new P();
        
        // // Case 2
        // C obj2 = new C();

        // Case 3
        P obj3 = new C();

        System.out.println(obj3.d); //USES d OF P Class
        System.out.println((obj3.d1)); //Uses d1 of P
        System.out.println(((C)(obj3)).d2); //Uses d2 of C
        // Also when we write program in coding state COMPILER TIME have the Control!! and Compiler see onlt Right-hand side
        System.out.println(((C)(obj3)).d); //Uses d of C

        // Case 4 "Not allowed in Inheritence  "
        // C obj4 = new P();

        // Now there is another way to use functions in inheritence other than for variable
       obj3.fun(); //Uses of C
       ((C)(obj3)).fun2();

    }
}