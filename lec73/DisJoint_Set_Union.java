package lec73;

import java.util.HashMap;

public class DisJoint_Set_Union {
    class Node {
        int vtx;
        Node parent;
        int rank;
    }

    private HashMap<Integer, Node> map = new HashMap<>();

    public void Create(int v) {
        Node nn = new Node();
        nn.vtx = v;
        nn.parent = nn;
        nn.rank = 0;
        map.put(v, nn);
    }

    public int find(int v) {
        Node rn = map.get(v);
        return representative(rn).vtx;
    }

    private Node representative(Node rn) {
        if (rn.parent == rn)
            return rn;
        Node rep = representative(rn.parent);
        rn.parent = rep; // Path Compression this Gives avg TC : O(N)
        return rep;
    }

    public void Union(int e1, int e2) {

        Node rv1 = map.get(e1);
        Node rv2 = map.get(e1);

        Node ren1 = representative(rv1);
        Node ren2 = representative(rv2);

        if (ren1.rank == ren2.rank) {
            ren1.parent = ren2;
            ren2.rank++;
        } else if (ren1.rank > ren2.rank) {
            ren2.parent = ren1;
            // ren2.rank++;
        } else {
            ren1.parent = ren2;
            // ren1.rank++;
        }

    }
}