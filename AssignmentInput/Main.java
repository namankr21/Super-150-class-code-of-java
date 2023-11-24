// package AssignmentInput;

package AssignmentInput;

//replace with sum of greater TreeNodes
import java.util.*;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

	TreeNode(int data){
		this.data=data;
		left=right=null;
	}
}

public class Main {
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		prevSum = 0;
		TreeNode root=InorderSeBST(arr,0,arr.length-1);

		sc.close();
		
        solve(root);
		Display(root);
	}
	static int prevSum;
	// construction of binary serach tree Using Inorder Traversal!!
	public static TreeNode InorderSeBST(int arr[],int s,int end){
        
        if(s>end)
			return null;
		
		// binary search.
		int mid=s+(end-s)/2;
		TreeNode root=new TreeNode(arr[mid]);

		root.left = InorderSeBST(arr,s,mid-1);
		root.right = InorderSeBST(arr,mid+1,end);

		return root;
    }
	// function to make BST to GST . Note this question is similar/same to leetcode 1008
	// isme hum 0 se start karna hoga.
	public static void solve(TreeNode root){
        
        if (root == null)	return;
    	solve(root.right);   

    	prevSum += root.data;

    	root.data = prevSum; 
    	solve(root.left);
    }
	
	public static void Display(TreeNode nn) {
		
		if(nn==null)
			return;

		System.out.print(nn.data+" ");
		Display(nn.left);
		Display(nn.right);
		
	}
}


// ---------------------------------------------------------------------------------------

/*

//Binary Tree Maximum Path Sum
import java.util.*;
class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int d){
        val=d;
        left=right=null;
    }
}
public class Main {

    static int max_sum;
    public static TreeNode CreateTree(){

        Scanner sc=new Scanner(System.in);
        Queue<TreeNode> q=new LinkedList<>();
        int ele=sc.nextInt();
        if(ele==-1)
            return null;

        TreeNode root=new TreeNode(ele);
        q.add(root);
        while(q.size()>0){

            TreeNode curr=q.remove();
            int l=sc.nextInt();
            if(l!=-1){
                curr.left=new TreeNode(l);
                q.add(curr.left);
            }
            int r=sc.nextInt();
            if(r!=-1){
                curr.right=new TreeNode(r);
                q.add(curr.right);
            }
        }
        return root;
    }
    // main function hai.
    public static void main (String args[]) {

        
        TreeNode root=CreateTree();
        
        maxPathSum(root);
        
        System.out.println(max_sum);
    }
    
    
    public static int maxPathSum(TreeNode root) {
    
        
    
        max_sum = Integer.MIN_VALUE;
    
        find(root);
    
        return max_sum; // as max_sum will always store the result
    
        
    }
    
    public static int find(TreeNode root) {
		
		// base case
        if (root == null) return 0; 
		
		// recursing through left and right subtree
        
        int leftMax = find(root.left);
        int rightMax = find(root.right);

		// finding all the four paths and the maximum between all of them
        
        
        int maxRightLeft = Math.max(leftMax, rightMax);
        
        int max_including_curr_treenode = Math.max(root.val, (root.val + maxRightLeft));
        
        int max_of_all_time = Math.max(max_including_curr_treenode, leftMax + rightMax + root.val);
		
		// Storing the result in the max_sum holder
        
        max_sum = Math.max(max_sum, max_of_all_time);
		
		// returning the value if root was part of the answer
        return max_including_curr_treenode;

    }
}

import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class Main {
    public static TreeNode CreateTree(){
        Scanner sc=new Scanner(System.in);
        int item = sc.nextInt();
		TreeNode root = new TreeNode();
		root.val = item;
		// nn = root;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode rv = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				TreeNode ll = new TreeNode();
				ll.val = c1;
				rv.left = ll;
				q.add(ll);

			}
			if (c2 != -1) {
				TreeNode ll = new TreeNode();
				ll.val = c2;
				rv.right = ll;
				q.add(ll);
			}

		}
        return root;
    }
    public static void main (String args[]) {
        TreeNode tree = CreateTree();
        
        
    }
}
 */
// import java.util.*;

// public class Main {

//     static Scanner sc=new Scanner(System.in);

//     public static void main (String args[]) {

//         TreeNode tree = createtree();
// 		// System.out.println(ht(tree));
// 		levelOrder(tree);
//         // 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
        
//     }
	
// 	public static bstpair find(TreeNode root)
// 	{

// 		if(root==null) return new bstpair();
		
		
// 		bstpair left = find(root.left);
// 		bstpair right = find(root.right);
// 		bstpair self = new bstpair();

// 		self.leftMax = Math.max(left.leftMax,root.val);
// 		self.rightMin = Math.min(left.rightMin,root.val);
		
// 		self.isbst = (left.isbst && right.isbst) && (self.leftMax < root.val && root.val < self.rightMin);
// 		if(self.isbst)
// 		self.ans = Math.max(left.len,right.len)+1;
		


// 		return self;
		
// 	}


// 	public static int ht(TreeNode root) {
// 		if(root==null) return 0;
		
// 		int left = ht(root.left);
		
// 		int right = ht(root.right);
		
// 		return Math.max(left,right) + 1;
//     }
//     public static void levelOrder(TreeNode tree) {
// 		// LinkedList<TreeNode> queue = new LinkedList<>();
// 		Queue<TreeNode> q = new LinkedList<>();
// 		Queue<TreeNode> hlp = new LinkedList<>();
// 		List<List<Integer>> ans = new ArrayList<>();
// 		List<Integer> ll = new ArrayList<>();
// 		q.add(tree);
// 		while (!q.isEmpty()) {
// 			TreeNode rv = q.remove();// remove first q.poll();
// 			// System.out.print(rv.data + " ");
// 			ll.add(rv.val);

// 			if (rv.left != null) {
// 				hlp.add(rv.left);
// 			}
// 			if (rv.right != null) {
// 				hlp.add(rv.right);
// 			}
// 			if (q.isEmpty()) {
// 				q = hlp;
// 				hlp = new LinkedList<>();
// 				ans.add(ll);
// 				ll = new ArrayList<>();
				
// 			}
// 		}
// 		System.out.println(ans);
// 		System.out.println();
// 	}
//     public static TreeNode createtree() 
//     {
		
		
// 		int item=sc.nextInt();
		
// 		TreeNode nn=new TreeNode();
		
// 		nn.val=item;
		
		
// 		boolean hlc=sc.nextBoolean();
// 		if(hlc==true) 
//         {
// 			nn.left=createtree();
// 		}
		
// 		boolean hrc=sc.nextBoolean();
		
//         if(hrc==true) 
//         {
// 			nn.right=createtree();
// 		}
		
// 		return nn;
// 	} 
	
// }

// class bstpair{
// 	int leftMax = Integer.MAX_VALUE;
// 	int rightMin = Integer.MIN_VALUE;
// 	int len = 0;
// 	int ans = 0;
// 	boolean isbst = true;
// }

// class TreeNode{

// 	int val;
// 	TreeNode left;
// 	TreeNode right;
// }

// /*
// import java.util.*;
// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
// }
// public class Main {
//     public static TreeNode CreateTree(){
//         Scanner sc=new Scanner(System.in);
//         int item = sc.nextInt();
// 		TreeNode root = new TreeNode();
// 		root.val = item;
// 		// nn = root;
// 		Queue<TreeNode> q = new LinkedList<>();
// 		q.add(root);
// 		while (!q.isEmpty()) {
// 			TreeNode rv = q.remove();
// 			int c1 = sc.nextInt();
// 			int c2 = sc.nextInt();
// 			if (c1 != -1) {
// 				TreeNode ll = new TreeNode();
// 				ll.val = c1;
// 				rv.left = ll;
// 				q.add(ll);

// 			}
// 			if (c2 != -1) {
// 				TreeNode ll = new TreeNode();
// 				ll.val = c2;
// 				rv.right = ll;
// 				q.add(ll);
// 			}

// 		}
//         return root;
//     }
//     public static void main (String args[]) {
//         TreeNode tree = CreateTree();
        
        
//     }
// }
//  */