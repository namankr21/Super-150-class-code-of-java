package lec72;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph {

    class BipartitePair{
        int vtx;
        int dist;
        BipartitePair(int vtx,int dist)
        {
            this.vtx = vtx;
            this.dist = dist;
        }
    }

    public boolean isBipartite(int[][]graph)
    {
        HashMap<Integer,Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if(visited.containsKey(i))
            {
                continue;
            }
     
            q.add(new BipartitePair(i,0));

            while (!q.isEmpty()) {
                BipartitePair rp = q.poll();
                
                if(visited.containsKey(rp.vtx))
                {
                    if(visited.get(rp.vtx)!=rp.dist)
                    {
                        return false;
                    }
                    continue;
                }

                visited.put(rp.vtx,rp.dist);

                for (int nbrs : graph[rp.vtx]) {
                    if(!visited.containsKey(nbrs))
                    {
                        q.add(new BipartitePair(nbrs,rp.dist+1));
                    }
                }
                
            }


        }


        return true;
    }
    
}
