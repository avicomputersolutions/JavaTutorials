package LoopInjava.NumberTheory;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int number=1234567;
        int rev= 0;
        while(number !=0){
            int Digit= number %10;
    
            
            rev = rev * 10 + Digit;
    
            number = number / 10;
    
        }
    
    
        System.out.println(rev);
    }
}
