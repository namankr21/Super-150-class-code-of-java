package lec70;
import java.util.HashSet;
public class myGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.AddEdge(1, 4, 6);
		graph.AddEdge(1, 2, 10);
		graph.AddEdge(2, 3, 7);
		graph.AddEdge(3, 4, 5);
		graph.AddEdge(4, 5, 1);
		graph.AddEdge(5, 6, 4);
		graph.AddEdge(7, 5, 2);
		graph.AddEdge(6, 7, 3);

        System.out.println(graph.NoOfEdge());
        graph.display();
        System.out.println(graph.HasPath(1, 6));
        graph.PrintAllPath(1, 6, new HashSet<Integer>(), "");

    }
}