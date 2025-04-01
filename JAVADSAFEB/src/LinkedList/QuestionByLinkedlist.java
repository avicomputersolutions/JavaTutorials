package LinkedList;

import java.util.LinkedList;

public class QuestionByLinkedlist {
    public static void main(String[] args) {
        int[] arr={2,3,4};
        int target = 6;
        LinkedList<Integer> l= new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            l.add(arr[i]);
        }
        System.out.println(l);
        //Binary Search
        int s=0;
        int r=l.size()-1;
        while(s<r){

            if(l.get(s)+l.get(r)==target){
                System.out.println(s+","+r);
                break;
            }else if(l.get(s)+l.get(r)<target){
                s++;
            }else{
               r--;
            }
        }
//        for(int i=1;i<l.size();i++){
//
//                int sum = l.get(i-1)+l.get(i);
//                if(sum == target){
//                    System.out.println((i-1)+","+i);
//                }
//
//        }
    }
}
