package Stack;

public class Stack {
    int[] arr;
    int top;

    Stack(){
        arr = new int[10];
        top=-1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == arr.length -1;
    }

    void push(int data){
        if(isFull()){
            return ;
        }
        else{
            top +=1;
            arr[top]=data;
        }
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }else{
            int ele = arr[top];
            top -=1;
            return ele;
        }
    }

    int peek(){
        return arr[top];
    }

}
