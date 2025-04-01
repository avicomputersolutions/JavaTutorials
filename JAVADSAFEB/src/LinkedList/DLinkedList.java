package LinkedList;

public class DLinkedList {
    DNode start;
    DNode tail;

    void addatFirst(int data){
        DNode n = new DNode(data);
        if(start ==null){
            start=n;
            tail =n;
        }else{
            n.next = start;
            start.prev =n;
            start = n;
        }
    }
    void insertAtLast(int data){
        // At Last
        DNode n = new DNode(data);
        if(start == null){
            start = n;
            tail =n;
        }else{
            DNode cur = start;
            while(cur.next !=null){
                cur = cur.next;
            }
            cur.next = n;
            n.prev =cur;
            tail = n;
        }


    }

    void insertAtPos(int data,int pos){
        DNode n= new DNode(data);

        if(start == null){
            start = n;
            tail =n;
        }
        else{
            DNode cur=start;
            int index=1;
            while (index  != pos-1){
                cur = cur.next;
                index++;
            }
            cur.next.prev =n;
            n.next = cur.next;
            cur.next = n;
            n.prev =cur;

        }
    }
    void forwardPrint(){
        if(start == null){
            return ;
        }else{
            DNode cur = start;
            while(cur !=null){
                System.out.print(cur.data+"->");
                cur=cur.next;
            }
            System.out.println("null");
        }
    }

    void backwardPrint(){
        DNode last = tail;
        while(last !=null){
            System.out.print(last.data+"->");
            last=last.prev;
        }
        System.out.println("null");
    }

    void Reverse( ){
        DNode s = start;
        DNode e = tail;
        while(s != e){
            int temp = s.data;
            s.data = e.data;
            e.data =temp;
            s = s.next;
            e =e.prev;
         }

    }
}
