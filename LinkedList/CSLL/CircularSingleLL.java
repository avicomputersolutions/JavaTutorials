package LinkedList.CSLL;

public class CircularSingleLL {
        Node start;
        Node tail;

        void insertAtlast(int data){
                Node newNode = new Node(data);
                if (start == null){
                        start = newNode;
                        tail = newNode;
                        tail.next = start;
                }
                else{
                        tail.next =newNode;
                        tail =newNode;
                        tail.next= start;
                        // Node temp = start ;
                        // while(temp.next != start){
                        //         temp = temp.next;
                        // }
                        // temp.next =newNode;
                        // tail
                        // newNode.next = start ;
                }
        }
        void insertAtFirst(int data){
                Node newNode = new Node(data);


                if(start == null){
                        start =newNode;
                        newNode.next = start;
                }else{ 
                       
                      newNode.next = start;
                      start =newNode;
                      tail.next = start;
                }
        }




        void printcsll(){
                if(start == null){
                        System.out.println("Linked is Empty");
                    }else{
                        Node temp = start;
                        while (temp.next != start){
                            System.out.print(temp.data+"->");
                            temp = temp.next;
                        }
                        System.out.println(temp.data);
                       
                    }
        }
}
