



public class BinaryTreeClient {
    public static void main(String[] args) {
     
        BinaryTree bt = new BinaryTree();
        // bt.display();
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        // System.out.println(bt.find(50));
        System.out.println(bt.height());
        bt.preorder();
        bt.postorder();
        bt.inorder();
        bt.levelorder();
    }
    
}
