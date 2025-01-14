package LinkedList.CSLL;


public class Main {
    public static void printcsll(CircularSingleLL csll){
        
    }
    public static void main(String[] args) {
        CircularSingleLL csll=new CircularSingleLL();

        csll.insertAtlast(3);
        csll.insertAtlast(9);
        csll.insertAtlast(0);
        csll.insertAtlast(1);
        csll.insertAtlast(6);
        csll.insertAtlast(4);
        csll.insertAtlast(2);
        csll.insertAtlast(8);
        csll.insertAtlast(5);
        csll.insertAtlast(12);
        csll.insertAtFirst(15);

        // Node n1 = new Node(3);
        // Node n2 = new Node(9);
        //         Node n3 = new Node(0);
        //         Node n4 = new Node(1);
        //         Node n5 = new Node(6);
        //         Node n6 = new Node(4);
        //         Node n7 = new Node(2);
        //         Node n8 = new Node(8);
        //         Node n9 = new Node(5);
        //         Node n10 = new Node(12);
        
                // csll.start = n4;
                // n4.next =n6;
                // n6.next = n8;
                // n8.next = n2;
                // n2.next =n1;
                // n1.next = n7;
                // n7.next =n9;
                // n9.next = n10;
                // n10.next = n3;
                // n3.next =n5;
                // n5.next = csll.start;
        
                System.out.println(csll.start.data);
                System.out.println(csll.tail.data);
            }
        
            
}
