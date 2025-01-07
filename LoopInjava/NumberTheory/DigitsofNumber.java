package LoopInjava.NumberTheory;

public class DigitsofNumber {
    public static void main(String[] args) {
        int n=12345678;

       //  jab tk number zero na ho tb tk
       // remider = number  % 10   // Unit Digit of number
       // print remider
       // number = number / 10

        while ( n !=0){
            int unitDigit= n % 10;
            System.out.println(unitDigit);
            n = n/10;

        }

    }
}
