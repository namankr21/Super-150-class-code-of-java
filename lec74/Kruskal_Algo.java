package lec74;

// import java.util.HashMap;
// import java.util.List;

import java.util.*;

import lec73.DisJoint_Set_Union;

public class Kruskal_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Kruskal_Algo(int v)
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



    class EdgePair{
        int e1,e2,cost;
        public EdgePair(int e1,int e2,int cost)
        {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdge()
    {
        List<EdgePair> ll = new ArrayList<>();

        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public String toString(EdgePair e)
    {
        return e.e1 + " to " + e.e2 + " @ " + e.cost;
    }

    public void Kruskal()
    {
        List<EdgePair> ll = getAllEdge();
        Collections.sort(ll,new Comparator<EdgePair>(){
            @Override
            public int compare(EdgePair o1,EdgePair o2)
            {
                return o1.cost - o2.cost;
            }
        });

        DisJoint_Set_Union dsu = new DisJoint_Set_Union();
        for (int v : map.keySet()) {
            dsu.Create(v);
        }

        for (EdgePair e : ll) {
            int re1 = dsu.find(e.e1);
            int re2 = dsu.find(e.e2);
            if(re1==re2)
            {
                // Nothing
            }
            else{
                dsu.Union(e.e1, e.e2);
                System.out.println(e);
            }
        }
    }




}
