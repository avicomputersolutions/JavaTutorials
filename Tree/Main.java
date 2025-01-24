public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();

    t.insert(t.Root,3);
    t.insert(t.Root,2);
    t.insert(t.Root,1);
    t.insert(t.Root,4);
    t.preOrder(t.Root);
    System.out.println(t.Root);

      

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
