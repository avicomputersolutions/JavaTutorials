import java.util.InputMismatchException;
import java.util.Scanner;

public class EXP {
    public static void main(String[] args)  {
//        try {
//            int n = new Scanner(System.in).nextInt();
//            System.out.print(n);
//        }
//        catch (Exception i){
// System.out.println("You can enter only  integer numbers");
////           throw new RuntimeException(i);
//        }

        int[] arr = {1,1,3,3,5,5};
        try{
            for(int i=0;i<= arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
