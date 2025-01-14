package LoopInjava.NumberTheory;

public class PerfectSquare {
    public static void main(String[] args) {
        int num= 25;
        boolean PerfectSquare= false;
        for(int i=2;i<num;i++){
            if (i*i == num){
                PerfectSquare = true;
            }
        }
        
        if(PerfectSquare){
            System.out.println("PerfectSquare");
        }else{
            System.out.println("Not PerfectSquare");
        }
    }
}
