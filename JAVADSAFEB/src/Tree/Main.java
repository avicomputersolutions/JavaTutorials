package Tree;

public class Main {


    public static void preOrder(TreeNode r){
        if(r==null){
            return;
        }

        System.out.print(r.data+" ");
        preOrder(r.left);
        preOrder(r.right);
    }
    public static void inOrder(TreeNode r){
        if(r==null){
            return;
        }


        inOrder(r.left);
        System.out.print(r.data+" ");
        inOrder(r.right);
    }
    public static void postOrder(TreeNode r){
        if(r==null){
            return;
        }


        postOrder(r.left);

        postOrder(r.right);
        System.out.print(r.data+" ");
    }
    public static void main(String[] args) {
        TreeNode n1= new TreeNode(1);
        TreeNode n2= new TreeNode(2);
        TreeNode n3= new TreeNode(3);
        TreeNode n4= new TreeNode(4);
        TreeNode n5= new TreeNode(5);
        TreeNode n6= new TreeNode(6);
        TreeNode n7= new TreeNode(7);


        TreeNode Root;
        Root = n1;
        Root.left =n2;
        Root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right=n7;
        System.out.println("Pre Order");
        preOrder(Root);
        System.out.println();
        System.out.println("in Order");
        inOrder(Root);
        System.out.println();
        System.out.println("Post Order");
        postOrder(Root);
        Questions q = new Questions();
        int sum = q.sumOfNode(Root);
        System.out.println("Sum of Node  = "+sum);
        int totlaNode = q.totalNode(Root);
        System.out.println(" Total Node  = "+totlaNode);

        String no = q.generateNO(Root,"");
        System.out.println(Integer.parseInt(no));
    }
}
