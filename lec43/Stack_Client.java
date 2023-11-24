package lec43;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        My_Stack st = new My_Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("peek : " + st.peek());
        
        st.display();
    }
}