package lec45;
import java.util.Stack;
// TC : O(n^2) & AS : O(1)
public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
    public static void reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        int item = stack.pop();
        reverse(stack);
        pushToLast(stack, item);        
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