package Grp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int v= 5;
        int[][] vList = {
                {3,1,2},
                {0,2},
                {0,1,4},
                {0},
                {2}
        };
        Graph g= new Graph(v);

        for(int i=0;i<vList.length;i++){
            for(int j=0;j<vList[i].length;j++){
                g.addEdge(i,vList[i][j]);
            }
        }
        System.out.println("Enter source ");
        int src = new Scanner(System.in).nextInt();

        System.out.print(src +"->");
        g.printNeighbour(src);
    }
}
