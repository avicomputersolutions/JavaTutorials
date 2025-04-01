package Graph;

public class WeightedMain {
    public static void main(String[] args) {
        int[][] listMatrix =  {
                {0,1,100},
                {0,2,100},
                {0,3,200},
                {1,2,300}
        };
        int v = listMatrix.length;
        WeightedGraph wg= new WeightedGraph(listMatrix.length);
        for(int i=0;i<v;i++){
            for(int j=0;j<listMatrix.length;j++){
                if(i==listMatrix[j][0]){
                    WeightedEdge c= new WeightedEdge(i,listMatrix[j][1],listMatrix[j][2]);
                    wg.insetEdge(i,c);
                }
            }
        }
        int root =0;
        System.out.println(root+"->");
        for(int i=0;i<wg.graph[root].size();i++){
            System.out.print(wg.graph[root].get(i).des+"-> Weight ->" +wg.graph[root].get(i).weight);
            System.out.println();
        }
    }
}
