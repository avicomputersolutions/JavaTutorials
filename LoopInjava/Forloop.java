package LoopInjava;

public class Forloop {
        // Driver
        public static void main(String[] args) {
            //int a=21,22,23,24,25,26,27,28,29,30;
           // System.out.println(a);

           int start=21;
           int end=30;
           int diff=1;

           // Vertical print
           for(int i=start;i<=end;i=i+diff){
            System.out.println(i);
           }

           // Horizontal print
           for(int i=start;i<=end;i=i+diff){
            System.out.print(i+" ");
           }
           System.out.println();
        }
    
}
