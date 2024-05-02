package lec89;

public class distributeCoins {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    
    private TreeNode root;
    static int count = 0;
    public static int move(TreeNode root){

        if(root==null){
            return 0;
        }

        int left = move(root.left);
        int right = move(root.right);

        count+=Math.abs(left)+Math.abs(right);

        return left+right+root.val-1;
    }



}
