package Graph;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int v=4;

        Graph g= new Graph(v);
        // user input for connection/ Edge
//        int[][] vmatrix ={
//                {0,1,1,0},
//                {1,0,1,1},
//                {0,0,1,1},
//                {1,1,0,1}
//        };
        int[][] listMatrix =  {
                {0,1},
                {0,2},
                {0,3},
                {1,2}
        };

        for(int i=0;i<v;i++){
            for(int j=0;j<listMatrix.length;j++){
                if(i==listMatrix[j][0]){
                    Connection c= new Connection(i,listMatrix[j][1]);
                    g.insetEdge(i,c);
                }
            }
        }
//        g.insertEdge(vmatrix);
//        // Testing -> Whether path is available or not
        int resultv =0;

        g.printNeighbour(resultv);

    }


}
