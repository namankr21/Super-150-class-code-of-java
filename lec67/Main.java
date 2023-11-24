// package lec67;

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int test = sc.nextInt();
// 		while(test-->0)
// 		{
// 		    int n = sc.nextInt();
// 		    int m = sc.nextInt();
// 		    String x = sc.nextLine();
// 		    String s = sc.nextLine();
		    
// 		    int cal = -1;
// 		    int ans = 0;
// 		    while(cal==-1 && x.length()<=100)
// 		    {
// 		        ans++;
// 		        x+=x;
// 		        cal = x.indexOf(s);
// 		    }
// 		    if(cal!=-1)
// 		    System.out.println(ans);
// 		    else System.out.println("-1");
// 		}
// 	}
// }