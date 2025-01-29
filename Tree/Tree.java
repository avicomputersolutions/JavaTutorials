import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    Node Root;

    Tree(){
        Root =null;
    }

   void insert(Scanner sc){
        System.out.println("Enter the root of  Tree");
        Root = new Node(sc.nextInt());
        insertchild(Root,sc);
   }
   void insertchild(Node n,Scanner sc){
        System.out.println("Do you want to insert data at left of "+ n.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter value of left of "+ n.data);
            n.left = new Node(sc.nextInt());
            insertchild(n.left, sc);
        }
        System.out.println("Do you want to insert data at right of "+ n.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value of right of "+ n.data);
            n.right = new Node(sc.nextInt());
            insertchild(n.right, sc);
        }

   }

   void BFS(Node n){
    if (n==null){
        return;

    }
    Queue<Node> q= new LinkedList<>();
    q.add(n);
    q.add(null);

    while(!q.isEmpty()){
        Node cur= q.remove();
        if (cur == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }
        else{
            System.out.println(n.data);
            if(n.left !=null){
                q.add(n.left);
            } 
            if(n.right !=null){
                q.add(n.right);
            }
        }
    }
   }

   int heightOfTree(Node n){
        if(n==null){
            return -1;
        }
        int height =0;
        Queue<Node> q= new LinkedList<>();
    q.add(n);
    q.add(null);

    while(!q.isEmpty()){
        Node cur= q.remove();
        if (cur == null){

            height +=1;
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }
        else{
            
            if(n.left !=null){
                q.add(n.left);
            } 
            if(n.right !=null){
                q.add(n.right);
            }
        }
    }
    return height;
   }

   int count(Node n){
        if (n == null){
            return 0;
        }
        int left = count(n.left);
        int right = count(n.right);

        return left + right + 1;

   }
   int sum(Node n){
    if (n == null){
        return 0;
    }
    int left = sum(n.left);
    int right = sum(n.right);

    return left + right + Root.data;

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
