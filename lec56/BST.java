package lec56;

public class BST {
    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public  BST(int[]in){

        root = createTree(in,0,in.length-1);
    }

    private Node createTree(int[] in, int si, int ei) {
        
        if(si>ei) return null;

        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val = in[mid];

        nn.left = createTree(in, si, mid-1);
        nn.right = createTree(in, mid+1, ei);

        return nn;

    }
    public void inorder()
    {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node nn) 
    {
        if(nn==null) return;
        
        inorder(nn.left);
        System.out.print(nn.val+ " ");
        inorder(nn.right);
    }


}
