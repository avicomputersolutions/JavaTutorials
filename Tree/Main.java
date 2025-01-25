import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        Scanner sc = new Scanner(System.in);
        t.insert(sc);
        // t.preOrder(t.Root);
        
        System.out.println(t.count(t.Root));

      

        // // Pre-order 
        // System.out.println(t.Root.data);
        // System.out.println(t.Root.left.data);
        // System.out.println(t.Root.right.data);
        // t.preOrder(t.Root);
        
        // in-order
        
        // System.out.println(t.Root.left.data);
        // System.out.println(t.Root.data);
        // System.out.println(t.Root.right.data);

        // // post order
        // System.out.println(t.Root.left.data);
        
        // System.out.println(t.Root.right.data);
        // System.out.println(t.Root.data);
    }
}
