package lec47;
import java.util.Stack;
public class histogram {
    public static void main(String[] args) {
        int arr[]= {2,3,5,4,6,1,7};
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        { 
            while(!st.isEmpty()&&arr[i]<arr[st.peek()])
            {
                int hei = arr[st.pop()];
                int r = i;
                if(st.isEmpty())
                {
                    ans = hei*r;
                    area = Math.max(ans,area);
                }
                else
                {
                    int l = st.peek();
                    ans = hei*(r-l-1);
                    area = Math.max(ans,area);
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
                ans = hei*(r-l-1);
                area = Math.max(ans,area);
            }
        }
        System.out.println(area);
    }
}