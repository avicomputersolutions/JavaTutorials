package NumberTheory;

public class SumOfDigit {
    public static void main(String[] args) {
        int number=1234567;
        int sum=0;
        while(number!=0){
            int LastDigit=number % 10;
            sum +=LastDigit;

            number /=10; // Increment / Decrement Step
        }

        System.out.println(sum);
    }
}
