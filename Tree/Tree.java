public class Tree {
    Node Root;

    Tree(){
        Root =null;
    }

    Node insert(Node Root,int data){
        Node leafNode = new Node(data);
        if (Root==null){
            Root =leafNode;
        }
        else if ((Root.left == null && Root.right != null) || (Root.left == null && Root.right == null) ){
            Root.left =insert(Root.left,data);
        }else{
            Root.left =insert(Root.left,data);
        }
        return leafNode;
    }

    void preOrder(Node Root){
        if(Root == null){
            return;
        }
        System.out.println(Root.data);
        preOrder(Root.left);
        preOrder(Root.right);
    }
    void inOrder(Node Root){
        if(Root == null){
            return;
        }
        
        inOrder(Root.left);
        System.out.println(Root.data);
        inOrder(Root.right);
    }
    void postOrder(Node Root){
        if(Root == null){
            return;
        }
        
        postOrder(Root.left);
        postOrder(Root.right);
        System.out.println(Root.data);
    }
}
