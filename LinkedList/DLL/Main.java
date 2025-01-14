package LinkedList.DLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addNodeAtFirst(3);
        dll.addNodeAtFirst(5);
        dll.addNodeAtFirst(6);
        dll.addLast(9);
        dll.print();
    }
}
