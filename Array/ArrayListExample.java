package Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
    static void updateArrayList(ArrayList<Integer> arr,int index, Integer value){
        if(index <0 || index > arr.size()){
            System.out.println("Element does not exists");
        }
        arr.set(index, value);
    }
    static void SortArray(ArrayList<Integer> arr){
       Collections.sort(arr,Collections.reverseOrder());// Reverse order
       
    }

    static void foreachPrint(ArrayList<Integer> arr){
        arr.forEach((n)-> {System.out.println(n);});
    }

    static void updateArrayList(ArrayList<Integer> arr, Integer value,Integer newvalue){
        if(!arr.contains(value)){
            System.out.println("Element does not exists");
        }
        arr.set(arr.indexOf(value), newvalue);
    }

    //Driver
    public static void main(String[] args) {
       // int[] arr=new int[10];
        // ArrayList<Integer> newArray=new ArrayList<Integer>(){
        //     1,2,3,4,5
        // };
        
    }
}
