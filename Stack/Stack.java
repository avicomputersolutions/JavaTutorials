package Stack;

public class Stack {
    int top =-1;
    int[] data = new int[10];

    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == data.length;
    }

    void push(int d){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top +=1;
            data[top]=d;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
           
        int popele = data[top];
            top -= 1;
            return popele;
        
       
    }
    
    int peek(){
        return data[top];
    }
}
