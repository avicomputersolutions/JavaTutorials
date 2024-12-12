package Array;

import java.util.Scanner;

public class PrintingPredefinedArray {
    // Creation of Function
    static void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }

    static void insertionInArry(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
    }


    public static void main(String[] args) {
       // int[] arr= {2,3,1,5,6,7,9,10,12,19,0,15}; 

        int[] arr= new int[5];
        printArray(arr); // Calling of Function
        

        insertionInArry(arr);
        printArray(arr);

        

    }
    
}
