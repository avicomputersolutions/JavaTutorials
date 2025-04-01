//package Graph.Questions;
//
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        int n=3;
//        int[][] edge ={
//                {0,1},
//                {1,2},
//                {2,0}
//        };
//        int src = 0;
//        int des = 2;
//
//       Graph gph= new Graph(n);
//       for(int i=0;i<gph.g.length;i++){
//           for(int j=0;j<edge.length;j++){
//               if(i == edge[j][0] ){
//                   Edge e= new Edge(i,edge[j][1]);
//                   gph.g[i].add(e);
//               }
//               if(i==edge[j][1]){
//                   Edge e= new Edge(i,edge[j][0]);
//                   gph.g[i].add(e);
//               }
//
//           }
//       }
//
//       for(int i=0;i<gph.g[src].size();i++){
//           System.out.println(gph.g[src].get(i).des);
//       }
//
//
//
//    }
//}
