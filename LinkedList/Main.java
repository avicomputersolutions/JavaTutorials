package LinkedList;

public class Main {
 public static void main(String[] args) {
    SingleLinkedList sl=new SingleLinkedList();
    sl.AddNode(5);
    sl.AddNode(7);
    sl.AddNode(3);
    sl.AddNode(9);
    sl.print();
    sl.addAtFirst(6);
    sl.print();
    sl.addAtPosition(7, 3);
    sl.print();
 }   
}
