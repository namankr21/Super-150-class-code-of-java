package lec76;
import java.util.*;
// Gives TLE 

public class zeroOneMST {
    
    private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();

    public zeroOneMST(int v)
    {
        for(int i=1;i<=v;i++)
        {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int a,int b,int cost)
    {
        map.get(a).put(b, cost);
        map.get(b).put(a, cost);
    }
    
    class PrimsPair {
		int e1;
		int acqv;
		int cost;

		public PrimsPair(int e1, int acvq, int cost) {
			this.e1 = e1;
			this.acqv = acvq;
			this.cost = cost;
		}

		public String toString() {
			return this.e1 + " " + this.acqv + " @ " + this.cost;
		}
	}
    
	public void Prims() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
			public int compare(PrimsPair o1, PrimsPair o2) {
                
                return o1.cost - o2.cost;
			}
		});
        int ans = 0;
		pq.add(new PrimsPair(1, 1, 0));
		HashSet<Integer> visited = new HashSet<>();
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.e1)) {
				continue;
			}
			visited.add(rp.e1);
            ans+=rp.cost;
			// System.out.println(rp);
			for (int nbrs = 1; nbrs<=map.size();nbrs++) {
				if (!visited.contains(nbrs)) {
                    int cost = 0;
                    if(map.get(rp.e1).containsKey(nbrs))
                    {
                        cost = 1;
                    }					
					pq.add(new PrimsPair(nbrs, rp.e1, cost));
				}
			}
		}
        System.out.println(ans);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // vtx
        int m = sc.nextInt(); // edge
        zeroOneMST mst = new zeroOneMST(n);
        while(m-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            mst.AddEdge(a, b, 1);
        }
        sc.close();

        mst.Prims();


    }

}
