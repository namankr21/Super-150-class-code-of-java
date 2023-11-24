package lec46;
// stock span
// sunny building
// daily temp
import java.util.*;
public class stock_Span {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[]arr = {3,6,1,4,18,7,5,11};
        int[]ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] = i+1;
            else ans[i] = i - stack.peek();
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}