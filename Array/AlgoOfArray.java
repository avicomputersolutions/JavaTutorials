package Array;

import java.util.Scanner;

public class AlgoOfArray {

    // Conductor code
    static void printArray(int[] arr){ // Algorithm Initilisation/ Defination.   
            for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
    
    static void insertInArray(int[] arr){
            Scanner sc=new Scanner(System.in);
            for(int i =0; i<=arr.length-1;i++){
                arr[i]=sc.nextInt();
            }
    }



    // Driver Code
    public static void main(String[] args) {
    //     int[] a={1,2,1,3,2,9,8,7,4,5};
    //    // AlgoOfArray ag=new AlgoOfArray();
    //     printArray(a);

        int[] arr= new int[5];
        insertInArray(arr);
        printArray(arr);
    }
}
