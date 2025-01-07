package LoopInjava.NumberTheory;

public class ProductofDigits {
 public static void main(String[] args) {
    int date= 2561992;

    int product =1;

    while(date !=0){
        int Digit= date %10;

        
        product *= Digit;

        date = date / 10;

    }


    System.out.println(product);
 }   
}
