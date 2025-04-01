package LinkedList;

public class Dmain {
    public static void main(String[] args) {
//        DNode n1= new DNode(4);
//        DNode n2= new DNode(3);
//        DNode n3= new DNode(2);
//        DNode n4= new DNode(0);
//        DNode n5= new DNode(9);
//        DNode n6= new DNode(8);

      DLinkedList dl= new DLinkedList();
        dl.addatFirst(4);
        dl.addatFirst(5);
        dl.addatFirst(3);
        dl.addatFirst(0);
        dl.insertAtLast(7);
        dl.insertAtPos(9,3);

        dl.forwardPrint();

        dl.Reverse();
        dl.forwardPrint();


    }
}
