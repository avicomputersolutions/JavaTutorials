package NumberTheory;

public class PetersonNumber {
    public static void main(String[] args) {
        int number=145;
        int org=number;
        int sum=0;
        while(number!=0){
            int LastDigit=number % 10;
            int fact=1;
            for(int i=LastDigit;i>0;i--){
                fact*=i;
            }
            sum+=fact;
            number /=10; // Increment / Decrement Step
        }

        if(org==sum){
            System.out.println("PetersonNumber");
        
        }else{
            System.out.println("Not A PetersonNumber");
        }

    }
}
