package lec77;

// import java.util.HashMap;
// import java.util.Queue;
// import java.util.LinkedList;
import java.util.*;
public class topological_sort {
    
    HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();

    topological_sort(int v)
    {
        for(int i=1;i<=v;i++)
        map.put(i,new HashMap<>());
    }

    public void addedge(int v1 ,int v2)
    {
        map.get(v1).put(v2, 0);
    }

    public int[] indegree() {
        int v = map.size();
        int[]arr = new int[v+1];

        for (int key : map.keySet())
        {
            for (int nbrs : map.get(key).keySet())
            {
                arr[nbrs]++;
            }    
        }

        return arr;

    }

    public void Topological()
    {
        int[]in  = indegree();

        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<in.length;i++)
        {
            if(in[i]==0) q.add(i);
        }

        while(!q.isEmpty())
        {
            int v = q.poll();

            System.out.println(v + " ");

            for(int nbrs : map.get(v).keySet())
            {
                in[nbrs]--;
                if(in[nbrs]==0) q.add(nbrs);
            }


        }
    }


}
