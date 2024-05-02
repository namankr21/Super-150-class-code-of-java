package AssignmentInput;
import java.util.*;
public class make_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            int[]arr = new int[n];
            int sum = 0;
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            int k = (int)(sum/n);
            String ans = "YES";

            for(int i = 0;i<n-1;i++)
            {
                if(arr[i]<k)
                {
                    ans = "NO";
                    break;
                }
                arr[i+1] += arr[i]-k;
                arr[i] = k;
            }

            System.out.println(ans);
            

        }
        sc.close();
    }
}
