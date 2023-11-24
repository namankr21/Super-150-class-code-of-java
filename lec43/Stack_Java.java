package lec43;
import java.util.Stack;
public class Stack_Java {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(5);

        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
    }
    /*  
        Stack : LIFO
        ex- as we use our browser it works on LIFO 
        as we move from onr=e pafge to another then another then another 
        but when we move back it get to page at which we left.

        -push(10) : adding elements is called PUSH operation in Stack 
        -pop(10) : Removing ele is called POP
        -NOTE : we cant get or insert an middle element
        -size()
        -isEmpty()
        -peek() : top element
        -display()
        -isFull()
    */
}
