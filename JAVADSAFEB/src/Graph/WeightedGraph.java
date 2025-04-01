package Graph;

import java.util.ArrayList;

public class WeightedGraph {
    ArrayList<WeightedEdge> graph[];

    WeightedGraph(int V){
        graph = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

    }
    void insetEdge(int src, WeightedEdge c){
        graph[src].add(c);
    }
}
