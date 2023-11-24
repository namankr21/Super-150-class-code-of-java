package lec70;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Graph(int v)
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

    public boolean ContainsEdge(int v1,int v2) {
        return map.get(v1).containsKey(v2); 
    }

    public boolean ContainsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int NoOfEdge() {
        int count = 0; 
        for (int nbrs : map.keySet()) 
        {
            count += map.get(nbrs).size();    
        }
        return count/2;
    }

    public void RemoveEdge(int v) {
        for(int key : map.get(v).keySet())
        {
            map.get(key).remove(v);
        }       
        map.remove(v);
    }

    public void display() {
        for(int key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public boolean HasPath(int src,int des,HashSet<Integer> visited)
    {
        if(src==des)
        return true;
        visited.add(src);
        for(int nbr : map.get(src).keySet())
        {
            if(!visited.contains(nbr))
            {
                boolean ans = HasPath(nbr,des,visited);
                if(ans) return ans;
            }
        }
        return false;
    }

    public boolean HasPath(int src,int des) {
        return HasPath(src, des, new HashSet<>());
    }

    public void PrintAllPath(int src,int des,HashSet<Integer> visited,String str) {
        if(src==des)
        {
            str+=" -> " + src;
            System.out.println(str);
            return;
        }
        visited.add(src);
        for(int nbr : map.get(src).keySet())
        {
            if(!visited.contains(nbr))
            {
                PrintAllPath(nbr,des,visited,str+ " -> " +src);
            }
        }
        visited.remove(src);
        
    }

}