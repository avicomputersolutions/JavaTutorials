package Grp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<Integer> g[];
    int v;
    Graph(int v){
        this.v =v;
        g = new ArrayList[v];
        for(int i=0;i<v;i++){
            g[i] = new ArrayList<>();
        }
    }
    void addEdge(int src,int des){
        g[src].add(des);
    }

    void printNeighbour(int src){
        for(int i=0;i<g[src].size();i++){
            System.out.print(g[src].get(i)+" ");
        }
    }

    void BFS(int src){
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        q.add(src);
        while(!q.isEmpty()){
            int nextsrc = q.poll();
            System.out.println(nextsrc);
            for(int i=0;i<g[nextsrc].size();i++){
                if(!visited[g[nextsrc].get(i)]){
                    visited[g[nextsrc].get(i)] = true;
                    q.add(g[nextsrc].get(i));
                }
            }
        }
    }
}
