package Graph;

import java.util.ArrayList;

public class Graph {

    ArrayList<Connection> graph[];

    Graph(int V){
        graph = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

    }
    void insetEdge(int src, Connection c){
        graph[src].add(c);
    }

    void insertEdges(int[][] vmatrix){
        for(int i=0;i<vmatrix.length;i++){
            for(int j=0;j<vmatrix[i].length;j++){
                if(vmatrix[i][j] == 1){
                    Connection c= new Connection(i,j);
                    graph[i].add(c);
                }
            }
        }
    }

    void printNeighbour(int root){
        System.out.println(root+"->");
        for(int i=0;i<graph[root].size();i++){
            System.out.print(graph[root].get(i).dest+"->");
        }
    }

}
