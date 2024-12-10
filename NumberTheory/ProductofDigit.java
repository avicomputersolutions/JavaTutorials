package NumberTheory;

public class ProductofDigit {
    public static void main(String[] args) {
        int number=1234567;
        int ProductofDigit=1;
        while(number!=0){
            int LastDigit=number % 10;
            
            ProductofDigit *=LastDigit;
            number /=10; // Increment / Decrement Step
        }

        System.out.println(ProductofDigit);
    }
}
