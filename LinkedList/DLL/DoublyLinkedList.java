package LinkedList.DLL;

public class DoublyLinkedList  {
    Node head;


    void addNodeAtFirst(int data){
        Node n1= new Node(data);
        if(head == null){
            head = n1;
        }
        else{
            head.pre=n1;
            n1.nxt=head;    
            head = n1;

        }
    }
    
    
    void addLast(int data)
   {
     Node n1=new Node(data);
     if(head == null){
        head = n1;
     }else{
        Node start = head;
        while (start.nxt !=null) // to avoid Overflow
        {
            start = start.nxt;
        }
        n1.pre= start;
        start.nxt= n1;

     }
   }

   void print(){
    if ( head == null){
        System.out.println("LinkedList is Empty");
    }else{
        Node start =head;
        while(start !=null){
            System.out.print(start.data+"->");
            start= start.nxt;
        }
        System.out.println("null");
    }
   }
}
