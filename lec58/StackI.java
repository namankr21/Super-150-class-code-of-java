package lec58;
// interface me agar access modifier hata do toh by default public hota h,   agar usko default bnna h toh explicitly krna pdega!!


// kisi method ke same final lag gya toh woh kabhi over ride nhi ho Stack_CLass
// kisi class ke samne final lag gya woh class inherit nhi ho skata
// kisi variable ke samne final lag gya woh kabhi change nhi hona  skat
public interface StackI extends Dynamic_StackI,Data_Str {// A
    public void push(int item);

    public int pop();

    public int peek();

    // default void fun(){

    // }

    // int x = 9;
    // public static final these three keywords are added before int by java to access this in class

    // public static int fun1()
    // {
        
    //     return 0;

    // }
    // aisi method jo by deafult  , default ho usko body de sjkte h in JAVA 8, also public and static methods can also have body


    // NOW JAVA 9 CAME

    // private int fun2()
    // {
    //     return 5;
    // }
    // we can make private methods in interfaces 

}
