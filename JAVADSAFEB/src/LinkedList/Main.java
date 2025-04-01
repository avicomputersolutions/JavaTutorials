package LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL sl = new SLL();
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(8);

        sl.str = n2;
        n2.next =n1;
        n1.next = n3;

        sl.insertAtFirst(7);
        sl.insertAtFirst(9);
        sl.insertAtFirst(0);

       sl.insertAtLast(80);
        int pos =3;
        sl.insertAtPos(6,pos);

//        sl.deleteAtFirst();
//        sl.deleteAtLast();
//        sl.deleteAtPos(4);
        sl.printSLL();
        int l= sl.length();
        System.out.println("length =>"+l);
        int i = sl.linearSearchInSLL(3);
        System.out.println(i);





    }
}
