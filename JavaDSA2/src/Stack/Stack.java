package Stack;

public class Stack {
    int[] mem = new int[10];
    public int top=-1;

     public void push(int data){
         top +=1;
         mem[top]=data;
     }
     public int pop(){
         int data= mem[top];
         top -=1;
         return data;
     }

}
