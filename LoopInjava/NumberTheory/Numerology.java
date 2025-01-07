package LoopInjava.NumberTheory;

public class Numerology {
    public static void main(String[] args) {
        int date= 19082002;

        int sum =0;

        while(date !=0){
            int Digit= date %10;

            
            sum += Digit;

            date = date / 10;

        }


        System.out.println(sum);
    }
}
