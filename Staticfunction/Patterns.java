package Staticfunction;

import java.util.Scanner;

public class Patterns {
    // Conductor code

    // datatype functionName(input){}
    
    static void SquarePattern(int n){

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    static void leftTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
    static void invertedLeftTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
    static void rightTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int space=1;space<= n-row;space++){
                System.out.print(" "+ " ");
            }

            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    static void invertedRightTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" "+ " ");
            }
            
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    static void pyramidTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int space=1;space<= n-row;space++){
                System.out.print(" "+ "");
            }

            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    static void invertedPyramidTrianglePattern(int n){

        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" "+ "");
            }
            
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }




    // Driver Code
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of LIne");
        int no= sc.nextInt();
        SquarePattern(no);
        System.out.println();
        leftTrianglePattern(no);
        System.out.println();
        invertedLeftTrianglePattern(no);
        System.out.println();
        rightTrianglePattern(no);
        System.out.println();
        invertedRightTrianglePattern(no);
        System.out.println();
        pyramidTrianglePattern(no);
        System.out.println();
        invertedPyramidTrianglePattern(no);
        System.out.println("Kite pattern");
        leftTrianglePattern(no);
        invertedLeftTrianglePattern(no);
    }
}
