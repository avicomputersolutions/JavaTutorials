package LinkedList;

import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
    SingleLinkedList sl=new SingleLinkedList();
    //sl.AddNode(5);
    //sl.AddNode(7);
    //sl.AddNode(3);
   // sl.AddNode(9);
   // sl.print();
    //sl.addAtFirst(6);
    //sl.print();
   // sl.addAtPosition(7, 3);
    //sl.print();

    int[] arr = {2,3,5,6,9,0,1};
    for(int i=0;i<arr.length;i++){
        sl.AddNode(arr[i]);
    }
    sl.print();

    ArrayList<Integer> arr2 =new ArrayList<>();
    arr2.add(9);
    arr2.add(8);
    arr2.add(0);

    for(int i=0;i<arr2.size();i++){
        sl.AddNode(arr2.get(i));
    }
    sl.print();
 }   
}
