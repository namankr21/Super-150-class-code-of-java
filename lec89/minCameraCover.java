package lec89;

public class minCameraCover {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    
    private TreeNode root;

    static int count = 0;
    public static int find(TreeNode root){

        if(root==null) return 0;

        int left = find(root.left);
        int right = find(root.right);

        if(left==-1 || right==-1) 
        {
            count+=1;
            return 1;
        } else if(left==1 || right==1) {
            return 0;
        } else {
            return -1;
        }        
    }
}
