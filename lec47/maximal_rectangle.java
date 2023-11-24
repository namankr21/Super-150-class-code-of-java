package lec47;
import java.util.Stack;
public class maximal_rectangle {
    public static void main(String[] args) {
        char [][]arr = {{'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}};
        System.out.println(maximalRectangle(arr));
    }
    public static int maximalRectangle(char[][] matrix) {
        int[]arr = new int[matrix[0].length];
        int ans = 0;
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(matrix[i][j]=='0') arr[j] = 0;
                else
                arr[j]++;
            }

            ans = Math.max(ans,largestRectangleArea(arr));            

        }

        return ans;
    }
    public static int largestRectangleArea(int[] arr) {
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

        return area;

    }
}
