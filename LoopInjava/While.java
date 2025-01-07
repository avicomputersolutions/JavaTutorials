package LoopInjava;

public class While {
    public static void main(String[] args) {
        // for(Start,end,increment){}
        // start
        // while(start (condition) end){
        //     // statement to work on start
        //     increment
        // }
        // print 1 to 10
        // int start= 1;
        // while(start <=10){
        //     System.out.println(start);
        //     start++;
        // }

        // print left triangle pattern
        int row= 1;
        int n=5;
        while(row <= n){
            int sp=1;
            while(sp<=n-row){
                System.out.print(" "+"");
                sp++;
            }
            int col=1;
            while(col <= row){
                System.out.print("*"+" ");
                col++;
            }
            System.out.println();
            row++;
        }

        row=1;
        while(row <= (n-1)){
            int sp=1;
            while(sp<=row){
                System.out.print(" "+"");
                sp++;
            }
            int col=1;
            while(col <= (n-row)){
                System.out.print("*"+" ");
                col++;
            }
            System.out.println();
            row++;
        }



    }
}
