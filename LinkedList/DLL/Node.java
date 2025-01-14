package LinkedList.DLL;

public class Node {
    Node pre;
    int data;
    Node nxt;

    Node(int data){
        this.data = data;
        this.pre =null;
        this.nxt = null;
    }
}
