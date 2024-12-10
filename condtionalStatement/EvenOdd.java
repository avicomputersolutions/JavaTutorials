package condtionalStatement;

public class EvenOdd {
    public static void main(String[] args) {
        int number=65;
        int rem=number % 2;
        if( rem ==0){
            System.out.println("Even");
        }else{
            System.out.println("ODD");
        }
    }
}
