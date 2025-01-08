package LoopInjava.NumberTheory;

public class ArmStrong {
    public static void main(String[] args) {
        int number = 153;
        int org = number;
        int temp = number;

       

        // length 
        int len=0;
        while (org !=0){
            int d = org % 10;
            len++;
            org =org / 10;
        }
        // Length 


        // ArmStrong
        int arm = 0;
        while(temp !=0){
            int Digit = temp %10;
            arm += (int) Math.pow(Digit, len);

            temp =temp /10;
        }

        if(number == arm){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }
    }
}
