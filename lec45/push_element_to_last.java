package lec45;
import java.util.Stack;
// TC : O(n) & AS : O(1)
public class push_element_to_last {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        int element = -7;
        pushToLast(stack,element);  
        System.out.println(stack);
    }

    public static void pushToLast(Stack<Integer> stack,int element) {
        if(stack.isEmpty())
        {
            stack.push(element);
            return;
        }

        int item = stack.pop();
        pushToLast(stack, element);
        stack.push(item);
    }
}
