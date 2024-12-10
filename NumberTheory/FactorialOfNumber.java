package NumberTheory;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int number=5;
        int fact=1;
        for(int i=number;i>0;i--){
            fact *=i;
        }

        System.out.println(fact);
    }
}
