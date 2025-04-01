package LinkedList;

public class SLL {
    Node str;

    void printSLL(){
        Node cur = str;
        while(cur != null){
            System.out.print(cur.data
                    +" -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }


    void insertAtFirst(int data){
        // At Start
        Node n = new Node(data);
        if(str == null){
            str= n;
        }else{
            n.next = str;
            str = n;
        }

    }

    void insertAtLast(int data){
        // At Last
        Node n = new Node(data);
        if(str == null){
            str = n;
        }else{
            Node cur = str;
            while(cur.next !=null){
                cur = cur.next;
            }
            cur.next = n;
        }


    }

    void insertAtPos(int data,int pos){
        Node n= new Node(6);

        if(str == null){
            str = n;
        }
        else{
            Node cur=str;
            int index=1;
            while (index  != pos-1){
                cur = cur.next;
                index++;
            }
            n.next = cur.next;
            cur.next = n;

        }
    }

    void deleteAtFirst(){
        if( str == null){
            System.out.println("Linked List is Empty");

        }else{
            str =str.next;
        }

    }

    void deleteAtLast(){
        if( str == null){
            System.out.println("Linked List is Empty");

        }else{
            Node cur = str;
            Node prev= str;
            while(cur.next !=null){
                prev= cur;
                cur= cur.next;
            }
            prev.next =null;
        }
    }

    void deleteAtPos(int pos){
        if(str == null){
            System.out.println("Linked List is Empty");
        }
        else{
            Node prev=str;
            int index=1;
            while (index  != pos-1){
                prev = prev.next;
                index++;
            }
         prev.next =prev.next.next;

        }
    }


    int length(){
        int len;
        if(str ==null){
            return 0;
        }else{
            len = 1;
            Node cur=str;
            while(cur.next!=null){
                len++;
                cur=cur.next;
            }
        }
        return len;
    }


    int linearSearchInSLL(int data){

       if(str == null){
           return -1;
       }else{
           int i=1;
           Node cur= str;
           while(cur !=  null){
               if(cur.data== data){
                   return i;
               }
               cur= cur.next;
               i++;
           }
       }
       return -1;
    }

}
