package Array;

public class Array {
    public static void main(String[] args) {
        int[] res=new int[10];
        System.out.println(res); //  res is the starting position of array in memory
        //length of all position
        System.out.println("Total length = "+res.length);
        // lets print  the last position of array
            System.out.println("the position of array = "+(res.length -1) );
        // first position of array always be 0
        // so print all position
        for(int i=0;i<=res.length-1;i++){
            System.out.println(i);
        }
    }
}
