package Graph.Questions;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question {
    public static void main(String[] args) throws IOException {
        int v = 5;
        int[][] g = {
                {0,1},
                {0,2},
                {0,3},
                {1,0},
                {1,2},
                {2,0},
                {2,1},
                {2,4},
                {3,0},
                {4,2}
        };

        Graph gph = new Graph(v);
        for(int i=0;i<gph.g.length;i++){
           for(int j=0;j<g.length;j++){
               if(i == g[j][0] ){
                   gph.g[i].add(g[j][1]);
               }

           }
       }


        //BFS
        System.out.println("BFS");
        boolean[] visited =new boolean[v];
        int src =0;
        Queue<Integer> q = new LinkedList<>();

        visited[src] = true;
        q.add(src);
        while(!q.isEmpty()){
            int ns = q.poll();
            System.out.print(ns+" ");
            Iterator<Integer> i = gph.g[ns].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        //DFS
        System.out.println("DFS");
        boolean[] Dvisited =new boolean[v];
        int r =0;
        Stack<Integer> s = new Stack<>();

        Dvisited[r] = true;
        s.push(r);
        while(!s.isEmpty()){
            int ns = s.pop();
            System.out.print(ns+" ");
            Iterator<Integer> i = gph.g[ns].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!Dvisited[n]){
                    Dvisited[n]=true;
                    s.push(n);
                }
            }
        }




    }
}
