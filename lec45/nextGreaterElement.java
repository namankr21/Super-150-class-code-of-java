package lec45;
import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {11,2,3,23,13,9,15};
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&arr[i]>arr[stack.peek()])
            {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()] = -1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
