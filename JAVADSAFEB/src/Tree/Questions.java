package Tree;

public class Questions {
    int sumOfNode(TreeNode r){
        if(r==null){
            return 0;
        }
        int leftsum = sumOfNode(r.left);
        int rightsum = sumOfNode(r.right);

        return leftsum + rightsum+ r.data;
    }

    int totalNode(TreeNode r){
        if(r==null){
            return 0;
        }
        int left = totalNode(r.left);
        int right = totalNode(r.right);

        return left+right + 1;
    }

    String generateNO(TreeNode r,String s){
        if(r== null){
            return "";
        }
        s = s+String.valueOf(r.data);
         String left=  generateNO(r.left,s);
         String right = generateNO(r.right,s);
         return s;
    }
}
