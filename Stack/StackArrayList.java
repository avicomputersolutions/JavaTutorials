package Stack;

import java.util.ArrayList;

public class StackArrayList<T> {
    ArrayList<T> stack =new ArrayList<T>();

    boolean isEmpty(){
        return stack.size() <= 0;
    }
    void push(T d){
       stack.add(d);
    }
    T pop(){
        return stack.removeLast();
    }
    T peek(){
        return stack.get(stack.size()-1);
    }
}
