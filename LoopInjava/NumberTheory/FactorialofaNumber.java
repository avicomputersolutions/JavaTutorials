package LoopInjava.NumberTheory;

public class FactorialofaNumber {
    public static void main(String[] args) {
        int n=5;

        //  5! = 5 * 4!
        //  4! = 4 * 3!
        //  3! = 3 * 2!
        //  2! = 2 * 1!
        //  1! = 1 * 0!
        
        // we Know 0! = 1 

        // 1! = 1 * 1
        // 2!= 2 * 1 * 1
        // 3!= 3 * 2* 1 *1
        // 4!= 4 * 3 * 2 * 1 *1 
        // 5! = 5 * 4 * 3 * 2 * 1 * 1

        int fact =1;
        while (n != 0){
            fact *= n;
            n--;
        }

        System.out.println(fact);

    }
}
