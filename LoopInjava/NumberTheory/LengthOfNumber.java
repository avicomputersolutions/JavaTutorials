package LoopInjava.NumberTheory;

public class LengthOfNumber {

    public static void main(String[] args) {
        int number= 123456789;
        int len =0;

        while (number !=0){
            int Digit= number % 10;
            len += 1;

            number =number / 10;
        }


        System.out.println(len);
    }
}