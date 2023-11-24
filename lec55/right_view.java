package lec55;

import java.util.*;

public class right_view {
    
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

    int maxdepth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> li = new ArrayList<>();
        rightSideView(root,0,li);
        return li;
        
    }

    private void rightSideView(TreeNode root, int currlevel, List<Integer> li) {
        if(root==null)
        {
            return;
        }
        if(maxdepth<currlevel)
        {
            li.add(root.val);
            maxdepth = currlevel;
        }

        rightSideView(root.right, currlevel+1, li);
        rightSideView(root.left, currlevel+1, li);
        
    }
}
