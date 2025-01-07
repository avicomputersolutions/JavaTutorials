package LinkedList;

public class SingleLinkedList {
    Node head;

    void addAtFirst(int data){
        Node n1 = new Node(data);

        // Overflow and Underflow and Empty
        if (head == null){  // Add at First position
            head = n1;
        }else{
            n1.ptr = head;
            head =n1;
        }
    }

    void addAtPosition(int data,int pos){
        Node n1=new Node(data);
       
       
        Node cur = head;
        int index=1;
        Node prev= head;
       
       
        while (index < pos){
            
            prev =cur;
            cur = cur.ptr;
            index++;
        }
        prev.ptr=n1;
        n1.ptr=cur;

    }

    void AddNode(int data){
        Node n1 = new Node(data);

        // Overflow and Underflow and Empty
        if (head == null){  // Add at First position
            head = n1;
        } else{ // At last position
            Node start = head ;
            while( start.ptr != null){
                start = start.ptr;
            }
            start.ptr = n1;
        }

    }


    // to Print LinkedList
    void print(){


        // Overflow
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
         else{
        Node cur = head ; 
        while(cur !=null){
            System.out.print(cur.data+" -> ");
            cur= cur.ptr;
        }
        System.out.println("null");
         }
    }
}
