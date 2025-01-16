package Stack;

public class StackByLinkedList<T> {
    
    class Node<T>{

        T data;
        Node<T> next;
        Node<T> prev;
        Node(T data){
            this.data =data;
            this.next =null;
            this.prev = null;
        }
    }
    
    Node<T> head;
    Node<T> top;

    boolean isEmpty(){
        return head == null;
    }

    void push(T data){
        Node<T> n1 =new Node<>(data);
        if(isEmpty()){
            head =n1;
            top  = n1;


        }
        else{
            top.next = n1;
            n1.prev =top;
            top =n1;
        }
    }
    T pop(){
        T d =top.data;
        top.prev.next= null;
        top =top.prev;
        return d;
    }
}
