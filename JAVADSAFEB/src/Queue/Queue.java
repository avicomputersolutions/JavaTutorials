package Queue;

public class Queue {
    int[] arr;
    int front;
    int rear;


    Queue(){
        arr = new int[5];
        rear =-1;
        front =-1;
    }

    boolean isEmpty(){
        return front ==-1 && rear ==-1;
    }
    boolean isfull(){
        return rear == arr.length-1 && front !=-1;
    }

    void enque(int data){
        if(isfull()){
            return ;
        }
        else{
            if(front == -1){
                rear+=1;
                front+=1;
                arr[rear]=data;
            }else{
                rear +=1;
                arr[rear] =data;
            }
        }
    }

    int deque() {

        if (front == arr.length - 1 && (rear == arr.length - 1)) {
            int ele = arr[front];
            front = -1;
            rear = -1;
            return ele;
        } else {
            int ele = arr[front];
            front += 1;
            return ele;
        }
        
    }


}
