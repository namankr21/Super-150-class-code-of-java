package lec56;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public Binary_Tree_Level_Order_Traversal() {
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

    public static void main(String[] args) {
        Binary_Tree_Level_Order_Traversal bt = new Binary_Tree_Level_Order_Traversal();
        bt.createTree();
            
    } 
}
