package Patterns;

public class InvertedPyramid{
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n;r++){
            for(int sp=1;sp<=r-1; sp++){
                System.out.print(" "+"");
            }
            for(int c=1;c<=n-r+1;c++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}