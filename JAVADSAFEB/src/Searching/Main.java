package Searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={8,2,1,3,4,1,0,9}; //
//        int val = 4;
//        Lsearch ls=new Lsearch();
////        int index=ls.LinearSearch(arr,val);
//        Arrays.sort(arr); // {0,1,1,2,3,4,8,9}
//        int index=ls.binarySearch(arr,val);
//        if(index==-1){
//            System.out.println("Value is not in array");
//        }
//        else{
//            System.out.println("Value is found at Position "+index);
//        }

        QuestionBasedOnLinearSearch qb= new QuestionBasedOnLinearSearch();
//        int max=qb.maxofArray(arr);
//        System.out.println("Maximum of array is "+max);
//        int min = qb.minofArray(arr);
//        System.out.println("Minimum of the array is "+min);
//        int smax = qb.SecondmaxofArray(arr);
//        System.out.println("Second maximum in array is "+smax);
//        int kthMax= qb.KthMaximum(arr,4);
//        System.out.println("Kth Maximum "+kthMax);
//
//        System.out.println();
//        System.out.println("Reverse Array:");
//        arr = qb.reverseArray(arr);
//        for(int val : arr){
//            System.out.print(val+" ");
//        }
        int rs= qb.kthFactor(12,3);
        System.out.println(rs);
    }
}
