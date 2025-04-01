package LinkedList;

public class CLinkedList {

    Node start;
    Node tail;

    void printCl(){
        if(start == null){
            return;
        }
        else{
            Node cur = start;
            while(cur.next != start){
                System.out.println(cur.data+"->");
                cur= cur.next;
            }
            System.out.println(cur.data);
        }
    }
    void insertatFisrt(int data){
        Node n=new Node(data);
        if(start == null){
            start=n;
            tail=n;
            tail.next=start;
        }else{
            n.next=start;
            start=n;
            tail.next=start;
        }
    }
    void insertAtLast(int data){
        Node n= new Node(data);
        if(start == null){
            start = n;
            tail = n;
            tail.next= start;
        }else{
            Node cur= start;
            while(cur.next !=start){
                cur = cur.next;
            }
            cur.next= n;
            tail=n;
            tail.next= start;
        }
    }
}
