package LoopInjava.NumberTheory;

public class SunnyNO {
 public static void main(String[] args) {
    int num= 24;
    int nxt = num +1;
    boolean PerfectSquare= false;
    for(int i=2;i<nxt;i++){
        if (i*i == nxt){
            PerfectSquare = true;
        }
    }
    
    if(PerfectSquare){
        System.out.println("Sunny");
    }else{
        System.out.println("Not Sunny");
    }
 }   
}
