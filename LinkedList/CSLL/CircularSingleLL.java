package LinkedList.CSLL;

public class CircularSingleLL {
        Node start;

        void insertAtlast(int data){
                Node newNode = new Node(data);
                if (start == null){
                        start = newNode;
                        newNode.next = start;
                }
                else{
                        Node temp = start ;
                        while(temp.next != start){
                                temp = temp.next;
                        }
                        temp.next =newNode;
                        newNode.next = start ;
                }
        }
        void insertAtFirst(int data){
                Node newNode = new Node(data);


                if(start == null){
                        start =newNode;
                        newNode.next = start;
                }else{ 
                        Node temp = start ;
                        while(temp.next != start){
                                temp = temp.next;
                        }
                        newNode.next = start;
                        start = newNode;
                        temp.next =start ;
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
