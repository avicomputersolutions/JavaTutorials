package LoopInjava.NumberTheory;

public class Palindrome {
    public static void main(String[] args) {
        
        // Take a Number
        int number = 121;
        // Make the Requirement copy  == Loop + 1
        int org = number;

        
        // Calculate the Required Formula
       
        int rev=0;
        while(number !=0){
            int Digit= number % 10;
            rev = 10 * rev +Digit;

            number = number /10;
        }


        // Compare the org copy with output of the Formula given

        if ( org == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
