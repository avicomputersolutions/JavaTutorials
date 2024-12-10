package NumberTheory;

public class PrintDigits {
    public static void main(String[] args) {
        int number=1234567;
        while(number!=0){
            int LastDigit=number % 10;
            System.out.println(LastDigit);

            number /=10; // Increment / Decrement Step
        }
    }
}
