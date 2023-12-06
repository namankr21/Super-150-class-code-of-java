/*     Traversals
1. Pre-order 
root - left - right

2. Post-order
left - right - root

3. In-order
    left - root - right    
    
*/

import java.util.*;
public class BinaryTree {

    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        root = createTree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }

        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }

        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node nn) {
        if (nn == null)
            return;

        String s = "";
        s = "<-- " + nn.data + " -->";
        if (nn.left != null)
            s = nn.left.data + " " + s;
        else
            s = "Null " + s;
        if (nn.right != null)
            s += " " + nn.right.data;
        else
            s += " Null";
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }

    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if (nn == null)
            return Integer.MIN_VALUE;
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.data, Math.max(left, right));
    }

    public boolean find(int item) {
        return find(root, item);
    }

    private boolean find(Node nn, int item) {
        if (nn == null)
            return false;

        if (nn.data == item)
            return true;
        boolean f1 = find(nn.left, item);
        boolean f2 = find(nn.right, item);

        return f1 || f2;

    }

    public int height()
    {
        return height(root);
    }

    private int height(Node nn) {
        if(nn==null)
        {
            return -1; // single node ki height 0 ke liye
            // return 0; // single node ki height 1 ke liye
        }

        int lh = height(nn.left);
        int rh = height(nn.right);
        
        return Math.max(lh,rh)+1;
    }

    public void preorder()
    {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node nn) 
    {
        if(nn==null) return;
        System.out.print(nn.data + " ");
        preorder(nn.left);
        preorder(nn.right);
    }
    public void postorder()
    {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node nn) 
    {
        if(nn==null) return;
        
        postorder(nn.left);
        postorder(nn.right);
        System.out.print(nn.data + " ");
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
        System.out.print(nn.data + " ");
        inorder(nn.right);
    }

    public void levelorder()
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node removed = q.remove(); // remove first q.poll();
            System.out.print(removed.data + " ");
            if(removed.left!=null) q.add(removed.left);
            if(removed.right!=null) q.add(removed.right);

        }

        System.out.println();
    }


}