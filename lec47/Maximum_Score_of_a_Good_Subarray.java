package lec47;
import java.util.*;
public class Maximum_Score_of_a_Good_Subarray {
    public static void main(String[] args) {
        int arr[] = {1,4,3,7,4,5};
        int k = 1;
        System.out.println(maximumScore(arr, k)); 
    }
    public static int maximumScore(int[] nums, int k) {
        return largestRectangleArea(nums,k);
    }
    public static int largestRectangleArea(int[] arr,int k) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&&arr[i]<arr[st.peek()])
            {
                int hei = arr[st.pop()];
                int r = i;
                if(r-1>=k)
                {
                    if(st.isEmpty())
                    {
                        ans = hei*r;
                        area = Math.max(ans,area);
                    }
                    else
                    {
                        int l = st.peek();
                        if(l+1<=k)
                        {
                            ans = hei*(r-l-1);
                            area = Math.max(ans,area);
                        }
                    }
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty())
        {
            int hei = arr[st.pop()];
            if(st.isEmpty())
            {
                ans = hei*r;
                area = Math.max(ans,area);
            }
            else
            {
                int l = st.peek();
                if(l+1<=k)
                {
                    ans = hei*(r-l-1);
                    area = Math.max(ans,area);
                }
            }
        }

        return area;

    }
}
