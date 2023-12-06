package lec75;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Dijkstras_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Dijkstras_Algo(int v)
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

    class DijkstraPair{
        int vtx,cost;
        String acqpath;
        public DijkstraPair(int vtx,String acq,int cost)
        {
            this.vtx = vtx;
            this.cost = cost;
            acqpath = acq;
        }
        @Override
        public String toString()
        {
            return this.vtx + " " + this.acqpath + " @ " + this.cost;
        }
    }

    

    public void Dijkstra()
    {
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>(){
            @Override
            public int compare(DijkstraPair o1,DijkstraPair o2)
            {
                return o2.cost-o1.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(1, "1",0));

        while(!pq.isEmpty())
        {
            // 1. Remove
            DijkstraPair rv = pq.poll();

            // 2. ignore
            if(visited.contains(rv.vtx))
            {
                continue;
            }

            // 3. visited
            visited.add(rv.vtx);

            // 4. self work
            System.out.println(rv);

            // 5. add neighbours

            for (int nbrs  : map.get(rv.vtx).keySet()) {
                if(!visited.contains(nbrs))
                {
                    int cost = rv.cost + map.get(rv.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs,rv.acqpath+nbrs,cost));                
                }
            }


        }



    }

    public static void main(String[] args) {
        // fails on -ve weights
        Dijkstras_Algo graph = new Dijkstras_Algo(7);
        graph.AddEdge(1, 4, 6);
		graph.AddEdge(1, 2, 10);
		graph.AddEdge(2, 3, 7);
		graph.AddEdge(3, 4, 5);
		graph.AddEdge(4, 5, 1);
		graph.AddEdge(5, 6, 4);
		graph.AddEdge(7, 5, 2);
		graph.AddEdge(6, 7, 3);
        
        graph.Dijkstra();


    }

}