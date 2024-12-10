package NumberTheory;

public class PalindromeNo {
    public static void main(String[] args) {
        int number=1221;
        int org=number;
        int rev=0;
        while(number!=0){
            int LastDigit=number % 10;
            rev=rev *10+ LastDigit;

            number /=10; // Increment / Decrement Step
        }

        if(org==rev){
            System.out.println("PalindromeNo");
        
        }else{
            System.out.println("Not A PalindromeNo");
        }

    }
}
