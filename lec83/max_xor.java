package lec83;

public class max_xor {
    public class Node {
        Node zero;
        Node one;
    }
    // private Node root;
    // public max_xor()
    // {

    // }

    public void insert(Node root, int val) {
        Node curr = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (val & (1 << i));
            if (bit == 0) {
                if (curr.zero != null) {
                    curr = curr.zero;
                } else {
                    Node nn = new Node();
                    curr.zero = nn;
                    curr = nn;
                }
            } else {
                if (curr.one != null) {
                    curr = curr.one;
                } else {
                    Node nn = new Node();
                    curr.one = nn;
                    curr = nn;
                }
            }
        }
    }

}
