
import Stack.Stack;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
       int[] arr= {0,1,1,0,1,1,1,0,0,1,1,0};
        Arrays.sort(arr);
       int max=0;
       int c=0;
       int target =7;
       for(int i=1;i<arr.length;i++){
           if(arr[i-1]==arr[i]){
               c +=1;
               max=Math.max(max,c);
           }else{
               c=0;
           }
       }

        System.out.println(max+1);
//       Array ar = new Array();
////       int sum= ar.sumOfElement(arr);
////        System.out.println(sum);
//
////        ar.FactorialOfEachInArray(arr);
////        System.out.println(ar.CheckSum(arr,7));
////        ar.print(ar.PairSum(arr,7));
//        int c = ar.countPair(arr,7);
//        System.out.println(c);
//        Stack s= new Stack();
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        System.out.println(s.pop());
//        System.out.println(s.pop());

    }
}
