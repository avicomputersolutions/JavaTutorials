package Graph;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Edge>[]  createGraph(int vertex,int[][] edge){
        ArrayList<Edge> graph[]= new ArrayList[vertex];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();

        }

        for (int j = 0; j < edge.length; j++) {
            if(j == edge[j][0]){
                graph[j].add(new Edge(edge[j][0], edge[j][1]));
            }



    }
        return graph;
    }

    public static void main(String[] args) {
         int v=3;
        int[][] edge = {
                //0 1  2
                {0,1},// 0
                {1,2},// 1
                {2,0},// 2
        };

        ArrayList<Edge>[] graph = createGraph(v,edge);



            for(int j=0;j<graph[0].size();j++){
                System.out.println(graph[0].get(j).dest);
            }


    }
}
