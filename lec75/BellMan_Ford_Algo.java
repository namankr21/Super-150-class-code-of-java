package lec75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BellMan_Ford_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public BellMan_Ford_Algo(int v)
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

    public class BellManFordPair{
        int e1,e2,cost;
        public BellManFordPair(int e1,int e2,int cost)
        {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    
    public List<BellManFordPair> getAllEdge()
    {
        List<BellManFordPair> ll = new ArrayList<>();

        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new BellManFordPair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void BellMan_Ford()
    {
        int v = map.size();
        int [] dis = new int[v+1];
        Arrays.fill(dis,999999);
        List<BellManFordPair> ll = getAllEdge();
        for (int i = 1; i < dis.length; i++) {
            for (BellManFordPair e : ll) {
                System.out.println(e);



            }
        }
        
    }

}