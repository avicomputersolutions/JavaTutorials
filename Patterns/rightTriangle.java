package Patterns;

public class rightTriangle {
    /* 
        
        
                * 
              * * 
            * * * 
          * * * * 
        * * * * *
        
       
       
    */
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n;r++){
            for(int sp=1;sp<=n-r; sp++){
                System.out.print(" "+" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
