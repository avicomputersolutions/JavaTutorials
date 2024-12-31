package Patterns.NumberPatterns;

public class InvertedRow {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=1;i<=n;i++){
        //    for(int j=1;j<=n-i+1;j++){
        //        System.out.print((n-i+1)+" ");
        //    }
        //    System.out.println();
        // }
        // int n=5;
        // for(int i=1;i<=n;i++){
        //    for(int j=1;j<=n-i+1;j++){
        //        System.out.print(j+" ");
        //    }
        //    System.out.println();
        // }

        // int n=5;
        // for(int i=1;i<=n;i++){
        //    for(int j=1;j<=n-i+1;j++){
        //        System.out.print(i+" ");
        //    }
        //    System.out.println();
        // }

        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=n-i+1;j>=1;j--){
               System.out.print(j+" ");
           }
           System.out.println();
        }


    }
}
