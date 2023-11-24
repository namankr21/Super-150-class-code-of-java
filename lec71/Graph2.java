package lec71;

import java.util.*;

public class Graph2 {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Graph2(int v)
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

    public boolean BFS(int src,int des)
    {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while(!q.isEmpty())
        {
            // 1. remove (remove value)
            int rv = q.poll();

            // 2. ignore
            if(visited.contains(rv))
            {
                // return true for cycle detection
                continue;
            }

            // 3. visited marking
            visited.add(rv);

            // 4. self work
            if(rv==des)
            {
                return true;
            }

            // 5. neighbours adding
            for (int nbrs : map.get(rv).keySet()) {
                if(!visited.contains(nbrs))
                {
                    q.add(nbrs);
                }
            }

        }

        return false;

    }

    public boolean DFS(int src,int des)
    {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while(!st.isEmpty())
        {
            // 1. remove (remove value)
            int rv = st.pop();

            // 2. ignore
            if(visited.contains(rv))
            {
                // return true for cycle detection
                continue;
            }

            // 3. visited marking
            visited.add(rv);

            // 4. self work
            if(rv==des)
            {
                return true;
            }

            // 5. neighbours adding
            for (int nbrs : map.get(rv).keySet()) {
                if(!visited.contains(nbrs))
                {
                    st.push(nbrs);
                }
            }

        }

        return false;

    }

    public boolean BFT()
    {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if(visited.contains(src))
            {
                continue;
            }
            q.add(src);
            while(!q.isEmpty())
            {
                // 1. remove (remove value)
                int rv = q.poll();
    
                // 2. ignore
                if(visited.contains(rv))
                {
                    // return true for cycle detection
                    continue;
                }
    
                // 3. visited marking
                visited.add(rv);
    
                // 4. self work
                System.out.print(rv + " ");
    
                // 5. neighbours adding
                for (int nbrs : map.get(rv).keySet()) {
                    if(!visited.contains(nbrs))
                    {
                        q.add(nbrs);
                    }
                }
    
            }
        }

        return false;

    }

    
    

}