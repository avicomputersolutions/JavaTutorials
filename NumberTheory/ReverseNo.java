package NumberTheory;

public class ReverseNo {
    public static void main(String[] args) {
        int number=1234567;
        int rev=0;
        while(number!=0){
            int LastDigit=number % 10;
            rev=rev *10+ LastDigit;

            number /=10; // Increment / Decrement Step
        }

        System.out.println(rev);
    }
}
