package Graph.Questions;

import java.util.ArrayList;
import java.util.LinkedList;


public class Graph {
    LinkedList<Integer> g[];

    Graph(int v){
        g= new LinkedList[v];
        for(int i=0;i<g.length;i++){
            g[i]=new LinkedList<>();
        }
    }

}
