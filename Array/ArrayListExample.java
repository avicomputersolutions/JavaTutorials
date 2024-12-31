package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    // code 
    // Arraylist - insertion, Updation, Deletion, Creation,printing
    static void insertInArrayList(ArrayList<Integer> integer){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number you want");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter"+i+" number");
            integer.add(sc.nextInt());
                }
    }

    static void printArrayList(ArrayList<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n;i++){
            int value=arr.get(i);
            System.out.print(value+" ");
        }
        System.out.println();
    }
    static void deleteArrayList(ArrayList<Integer> arr,Integer value){
            if(arr.contains(value)){
                arr.remove(value);
                
            }
            else{
                System.out.println("Element not founnd");
            }
    }
    //Driver
    public static void main(String[] args) {
       // int[] arr=new int[10];
        ArrayList<Integer> newArray=new ArrayList<Integer>();
        insertInArrayList(newArray);
        printArrayList(newArray);
        deleteArrayList(newArray, 3);
        printArrayList(newArray);
    }
}
