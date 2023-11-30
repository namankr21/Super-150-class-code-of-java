package lec74;

// import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
// import java.util.List;
import java.util.PriorityQueue;

// import lec61.intersection;

public class Prims_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Prims_Algo(int v)
    {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<Integer,Integer>());
        }
    }

    public void AddEdge(int v1,int v2,int cost)
    {
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }


    class PrimsPair{
        int e1,e2,cost;
        public PrimsPair(int e1,int e2,int cost)
        {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    public void Prims()
    {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
        pq.add(new PrimsPair(3,3,0));
        HashSet<Integer> visited = new HashSet<>(); 
        while(!pq.isEmpty())
        {
            PrimsPair rp = pq.poll();
            if(visited.contains(rp.e1))
            {
                continue;
            }
            visited.add(rp.e1);

            System.out.println(rp);

            for (int nbrs : map.get(rp.e1).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.e1).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.e1, cost));
                }                
            }



        }
    }

    public String toString(PrimsPair e)
    {
        return e.e1 + " to " + e.e2 + " @ " + e.cost;
    }

}
