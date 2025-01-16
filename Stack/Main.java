package Stack;

public class Main {
    public static void main(String[] args) {
        StackByLinkedList<Integer>  st =new StackByLinkedList<Integer>();
        st.push(4);
        st.push(5);
        st.push(2);
        st.push(1);
        System.out.println(st.pop());
        System.out.println(st.pop());
        
        
    }
}
