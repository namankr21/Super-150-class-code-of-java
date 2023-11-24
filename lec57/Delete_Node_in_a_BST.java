package lec57;

public class Delete_Node_in_a_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
       return del(root,key);
    }
    public TreeNode del(TreeNode root, int key)
    {
        if(root==null) return root;
        if(root.val<key)
       {
            root.right = del(root.right, key);
       } 
       else if(root.val>key)
       {
            root.left = del(root.left, key);
       }
       else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else
            {
                int max = max(root.left);
                root.left = del(root.left, max);
                root.val = max;
            }
       }
        return root;
    } 
    public int max(TreeNode root)
    {
        if(root==null) return Integer.MIN_VALUE;

        int right = max(root.right);

        return Math.max(right,root.val);

    }
}
