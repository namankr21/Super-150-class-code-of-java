package lec45;
import java.util.Stack;
// TC : O(n) & AS : O(1)
public class get_last_element_in_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        lastElement(stack);
    }
    public static int lastElement(Stack<Integer> stack)
    {
        if(stack.size()==1)
        {
            // System.out.println(stack.peek());
            return stack.peek();
        }
        int item = stack.pop();
        int k = lastElement(stack);
        stack.push(item);
        return k;
    }
}
