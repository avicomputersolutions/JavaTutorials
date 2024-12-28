package Array;

public class ReversingofArray {

    // conductor code
    static void ReverseArray(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    static void ReverseArrayTwopointerWithForLoop(int[] arr){
        
        for(int l=0,r=arr.length-1;l<=r;l++){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
           
            r--;
        }
    }
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr={8,2,1,4,5,2,0,6};
        ReverseArray(arr);
        printArray(arr);
    }
    
}
